
package shop.shoes.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import shop.core.BillKeySystem;
import shop.shoes.common.GlobalException;
import shop.shoes.common.PurchaseCode;
import shop.shoes.common.StatusCode;
import shop.shoes.dao.PurchaseDAO;
import shop.shoes.dao.PurchaseDAOImpl;
import shop.shoes.model.AccountDTO;
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
}
