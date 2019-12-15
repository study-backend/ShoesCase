
package shop.shoes.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import shop.core.BillKeySystem;
import shop.shoes.common.GlobalException;
import shop.shoes.common.PurchaseCode;
import shop.shoes.common.StatusCode;
import shop.shoes.dao.PurchaseDAO;
import shop.shoes.dao.PurchaseDAOImpl;
import shop.shoes.model.AccountDTO;
import shop.shoes.model.CancelDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasketDTO;
import shop.shoes.model.PurchaseBasketPaymentDTO;
import shop.shoes.model.PurchaseGoodsDTO;
import shop.shoes.model.dto.PurchasePageDTO;
import shop.util.DateTimeHelper;

public class PurchaseServiceImpl implements PurchaseService {
	// 필요한 dAO 목록.....
	private static BillKeySystem keySystem = new BillKeySystem();

	private static PurchaseDAO dao = new PurchaseDAOImpl();
	
	@Override
	public int insertPurchase(List<GoodsDTO> goodsList, PurchaseBasketDTO basket, 
					PurchaseBasketPaymentDTO payment, AccountDTO account) throws Exception{
		
		
		try {
			
			// [0] 빌키 받아오기 //uuid
			String key = keySystem.issueBillKey();
			// 시간 동기화
			Date purchaseDate = DateTimeHelper.sqlDateNow();

			// [1] 계정 정보 알아오기 (로그인 세션에서 알수있음)
			long accountId = account.getAccountId();

			basket.setAccountId(accountId);
			basket.setStateCode(PurchaseCode.Payment_Success.getValue());
			basket.setOrderDate(purchaseDate);
			basket.setCreateDate(purchaseDate);
			basket.setUpdateDate(purchaseDate);

			///////////////////////////////////////////// 트랜잭션 시작
			// [2] basket 정보를 넣어주기 (seq로 return을 받는것이 가장 좋다)
			int basketResult = dao.insertBasket(basket);
			if (basketResult != 1) {
				throw new GlobalException("장바구니 입력실패", StatusCode.Fail_Add_PurchseBasket);
			}
			// 이 부분이 꼬였다.. basketId가 자동증가 값이라. 다시 select를 해야 한다 ㅠㅠㅠ
			// billkey로 pk를 잡는게 나을지도 모르겠다.
			// 1:1 관계는 join으로 해결해야 하는데 일단 급하니 join은 패스한다

			long basketId = dao.selectBasketId(key);
			// 받는사람 정보 삽입
			payment.setPurchaseBasketId(basketId);
			payment.setCreateDate(purchaseDate);
			payment.setUpdateDate(purchaseDate);
			// [3] 구매 payment 정보 넣어주기
			int paymentResult = dao.insertPayment(payment);
			if (paymentResult != 1) {
				throw new GlobalException("결제정보 입력실패", StatusCode.Fail_Add_PurchasePayment);
			}
			// [4] 구매할 상품 정보 넣어 주기 (아마 insert?)
			// 벌그인서트가 없다.. 아씨...ㅋㅋㅋ 아아아ㅏ아아ㅏ아얼닝런이런이러 일단 무식하게
			for (GoodsDTO goods : goodsList) {

				PurchaseGoodsDTO pGoods = new PurchaseGoodsDTO(PurchaseCode.Payment_Success.getValue(), goods.getName(),
						goods.getCount(), goods.getPrice(), goods.getImgPath(), key, basketId, goods.getGoodsId(),
						purchaseDate, purchaseDate, accountId);

				int pGoodsResult = dao.insertPurchaseGoods(pGoods);
				if (pGoodsResult != 1) {
					// 완전 존망 ㅠㅜㅜ
					throw new GlobalException("구매상품 입력실패", StatusCode.Fail_Add_PurchaseGoods);
				}
			}

			// 여기 까지 문제가 없다면
			// [5] billkey table에 완료시간을 기록하기
			int keyResult = keySystem.registerPurchase(key, purchaseDate);
			/////////////////////////////////////////////////////////////////////// 트랜잭션 종료 시키기 

			// [6] 구매 완료 시키기
			if (keyResult == 1) {
				return keyResult;
			} else {
				throw new GlobalException("구매 진행을 취소시킵니다", StatusCode.Fail_Issue_BillKey);
			}

		} catch(Exception e) {
			// 임시로 
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public PurchasePageDTO selectProduct(String loginId, String billKey) throws Exception{
			//장바구니에서 구매 넘어갈때 들고갈 상품 정보(조회)
		List<PurchaseGoodsDTO> purchaseGoods = dao.selectProduct(billKey);
			
			//주문자 정보 조회
		AccountDTO accountDTO = dao.selectOrderer(loginId);
			
		PurchasePageDTO purchasePage = new PurchasePageDTO(purchaseGoods,accountDTO);
		return purchasePage;
	}
	

	
	public List<PurchaseGoodsDTO> selectOrderHistory(String loginId) throws Exception{
		List<PurchaseGoodsDTO> list = dao.selectOrderHistory(loginId);
		if(list == null || list.isEmpty()) {
			throw new SQLException("주문내역 조회 실패");
		}
		return list;
	}

	@Override
	public int refund(String billKey, String reason, int refundType, List<PurchaseGoodsDTO> purchaseGoodsList) throws Exception {
		
		try {
			//구매당시의 Billkey를 가져 옴
			// 빌키 검증이 필요할까??? 
			Date cancelDate = DateTimeHelper.sqlDateNow();
			
			//해당 BillKey의 Basket 정보를 가져옴
			PurchaseBasketDTO basket = dao.selectBasketId(billKey);
			//해당 BillKey(basketId )의 Payment 정보를 가져옴 
			//(취소할 때 refund type을 넣도록 변경)
			//PurchaseBasketPaymentDTO payment = dao.selectPayment(basket.getBasketId());
			
			//해당 Basket 정보의 Goods를 가져옴
			// 단, 여기서 전체환불인지 부분환불인지 구분한다
			List<PurchaseGoodsDTO> goodsList = new ArrayList<>();
			if(purchaseGoodsList.size() == 0) {
				goodsList = dao.selectPurchaseGoodsList(basket.getBasketId());
			} else {
				for(PurchaseGoodsDTO purchaseGoods : purchaseGoodsList) {
					PurchaseGoodsDTO cancelGoods = dao.selectPurchaseGoods(purchaseGoods.getGoodsId());
					goodsList.add(cancelGoods);
				}
			}

			// 아래 부터는 환불 데이터를 수정 또는 입력하는 단계이다 즉 List<PurchaseGoodsDTO> goodsList 를 처리한다
			if(goodsList.size() > 0) {

				//Basket 상태 정보를 update 
				basket.setStateCode(PurchaseCode.Cancel_Ing.getValue());
				int basketResult = dao.updateBasket(basket);
				if(basketResult != 1) {
					throw new GlobalException("환불 상품 수정 실패", StatusCode.Fail_Update_BaksetState);
				}
				
				//해당 Basket의 Goods 상태 정보를 update
				for(PurchaseGoodsDTO goods : goodsList) {
					goods.setStateCode(PurchaseCode.Cancel_Ing.getValue());
					
					// 수량만 부분 환불할 경우 대처가 필요하다 (정책상 아예 환불 후 재구매를 할지 아니면 부분 환불을 수량까지 지원할지 정책이 필요함)
					// 세부 정책이 없기 때문에 수량 환불은 구매 수정으로 따로 API를 만들어 지원한다 / 옥션의 경우 수량 수정은 없고 배송정보 수정만 있다
					int goodsResult = dao.updateGoods(goods);
					if (goodsResult != 1) {
						// 완전 존망 ㅠㅜㅜ
						throw new GlobalException("환불 상품 수정 실패", StatusCode.Fail_Update_RefundState);
					}
					
					// 아래와 같이 1:1 로 맵핑되는 부분은 procedure로 하면 좋을 듯
					CancelDTO cancel = new CancelDTO();
					cancel.setBillKey(billKey);
					cancel.setGoodsId(goods.getGoodsId());
					cancel.setPurchaseBasketId(basket.getBasketId());
					cancel.setPurchaseGoodsId(goods.getPurchaseGoodId());
					cancel.setReason(reason);
					cancel.setRefundType(refundType);
					
					//해당 Goods의 Cancel 정보를 insert
					int cancelResult = dao.insertCancelGoods(cancel);
					if(cancelResult != 1) {
						throw new GlobalException("환불 상품 수정 실패", StatusCode.Fail_Add_CancelGoods);
					}
				}
				
				//해당 Billkey의 Cancel Date를 update 
				int keyResult = keySystem.registerCancel(billKey, cancelDate);
				
				//환불 완료 후 환불완료 페이지 이동  
				if (keyResult == 1) {
					return keyResult;
				} else {
					throw new GlobalException("환불 진행을 취소시킵니다", StatusCode.Fail_Cancel_BillKey);
				}
				
			} else {
				throw new GlobalException("환불 진행할 상품이 없습니다", StatusCode.Fail_Not_Exist_Goods);
			}

		}catch(Exception e) {
			// 임시 트랜잭션
			e.printStackTrace();
		}
				
	}

	@Override
	public int changePurchase(String billKey, List<PurchaseGoodsDTO> purchaseGoodsList) throws Exception {
		// 신발과 같은 경우는 수량이나 사이즈 수정이 필요해 보인다 
		// 배송정보의 수정과는 다르게 처리할지 정책이 필요하다
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PurchaseBasketDTO> selectPurchaseDetail(AccountDTO account) throws Exception {
		
		try {
			List<PurchaseBasketDTO> basketList = dao.selectBasketList(account.getAccountId());
			for(PurchaseBasketDTO basket : basketList) {
				
				PurchaseBasketPaymentDTO payment = dao.selectPayment(basket.getBasketId());
				
				basket.setPayment(payment);
				
				List<PurchaseGoodsDTO> purchaseGoodsList = dao.selectPurchaseGoodsList(basket.getBasketId());
				
				for(PurchaseGoodsDTO purchaseGoods : purchaseGoodsList) {
					int state = purchaseGoods.getStateCode();
					
					switch(state) {
						case PurchaseCode.Cancel_Ing.getValue(): {
							CancelDTO cancel = dao.selectCancel(purchaseGoods.getPurchaseGoodId());
							purchaseGoods.setCancel(cancel);
							break;
						}
						case PurchaseCode.Cancel_Success.getValue(): {
							CancelDTO cancel = dao.selectCancel(purchaseGoods.getPurchaseGoodId());
							purchaseGoods.setCancel(cancel);
							break;
						}
					}
				}
				
				basket.setPurchaseGoodList(purchaseGoodsList);
				
				return basketList;
			}
		}catch(Exception e) {
			// 위의 쿼리에서 문제가 없다면 모든 구매 정보를 보낸다 
			e.printStackTrace();
		}
		
		
	}
}
