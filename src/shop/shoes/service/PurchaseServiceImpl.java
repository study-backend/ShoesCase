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

public class PurchaseServiceImpl implements PurchaseService {
	// 필요한 dAO 목록.....

	PurchaseDAO dao = new PurchaseDAOImpl();
	@Override
	public int insertPurchase(List<GoodsDTO> goodsList, PurchaseBasketDTO basket, 
					PurchaseBasketPaymentDTO payment, AccountDTO account, PurchaseGoodsDTO purchaseGoodsDTO) {
		
		//[0] 빌키 받아오기
		
		//[1] 계정 정보 알아오기
		
		//[2] basket 정보를 넣어주기 
		List<PurchaseGoodsDTO> purchaseGoods = dao.selectProduct(basket.getBillKey());
		//주문자 정보 조회
		AccountDTO account = dao.selectOrderer(account.getLoginId());
		//받는사람 정보 삽입
		int reciever = dao.recieverInfo(payment);
		//[3] 구매 payment 정보 넣어주기 
		int payway = dao.paymentWay(payment.getPaymentType());
		//[4] 구매할 상품 정보 넣어 주기 (아마 insert?)
		int result = dao.insertPurchaseInfo(purchaseGoodsDTO);
		//[5] 구매 완료 시키기  
		
		
		return 0;
	}
	
	public List<PurchaseGoodsDTO> selectOrderHistory(long accountId) throws SQLException{
		
		return null;
	}
}
