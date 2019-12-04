
package shop.shoes.service;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.dao.PurchaseDAO;
import shop.shoes.dao.PurchaseDAOImpl;
import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasketDTO;
import shop.shoes.model.PurchaseBasketPaymentDTO;
import shop.shoes.model.PurchaseGoodsDTO;
import shop.shoes.model.dto.PurchasePageDTO;

public class PurchaseServiceImpl implements PurchaseService {
	// 필요한 dAO 목록.....

	PurchaseDAO dao = new PurchaseDAOImpl();
	@Override
	public int insertPurchase(List<GoodsDTO> goodsList, PurchaseBasketDTO basket, 
					PurchaseBasketPaymentDTO payment, AccountDTO account, PurchaseGoodsDTO purchaseGoodsDTO) throws SQLException{
		int result = 0;
		
		//[0] 빌키 받아오기 ????
		
		//[1] 계정 정보 알아오기
		Long accountId = account.getAccountId();
		//[2] basket 정보를 넣어주기 
		int insertAllBasket = dao.insertAllBasket(basket);
		//받는사람 정보 삽입
		int reciever = dao.recieverInfo(payment);
		//[3] 구매 payment 정보 넣어주기 
		int payway = dao.paymentWay(payment.getPaymentType());
		//[4] 구매할 상품 정보 넣어 주기 (아마 insert?)
		int insertPurchaseInfo = dao.insertPurchaseInfo(purchaseGoodsDTO);
		
		//[5] 구매 완료 시키기
		if(accountId != null && insertAllBasket>0 &&  reciever>0 && payway >0 && insertPurchaseInfo>0) {
			result = 1;
		}
		return result;
	}
	
	public PurchasePageDTO selectProduct(String loginId, String billKey) throws SQLException{
			//장바구니에서 구매 넘어갈때 들고갈 상품 정보(조회)
		List<PurchaseGoodsDTO> purchaseGoods = dao.selectProduct(billKey);
			
			//주문자 정보 조회
		AccountDTO accountDTO = dao.selectOrderer(loginId);
			
		PurchasePageDTO purchasePage = new PurchasePageDTO(purchaseGoods,accountDTO);
		return purchasePage;
	}
	

	
	public List<PurchaseGoodsDTO> selectOrderHistory(long accountId) throws SQLException{
		List<PurchaseGoodsDTO> list = dao.selectOrderHistory(accountId);
		if(list == null || list.isEmpty()) {
			throw new SQLException("주문내역 조회 실패");
		}
		return list;
	}
}
