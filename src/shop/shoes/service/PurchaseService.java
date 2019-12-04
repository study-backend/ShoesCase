package shop.shoes.service;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasketDTO;
import shop.shoes.model.PurchaseBasketPaymentDTO;
import shop.shoes.model.PurchaseGoodsDTO;

public interface PurchaseService {

	/**
	 * 상품 구매 (바스켓은 왜 DTO가 아니지??? PurchaseBasketPayment 도. 네이밍 수정 부탁)
	 * 아래 파라미터는 화면에서 오는 정보로 내부에서 사용하기 편하게 변경될 수 있음
	 * */
	
	public int insertPurchase(List<GoodsDTO> goodsList, PurchaseBasketDTO basket, 
			PurchaseBasketPaymentDTO payment, AccountDTO account,PurchaseGoodsDTO purchaseGoodsDTO);
	
	/**
	 * 구매내역 조회
	 * 
	 * */
	public List<PurchaseGoodsDTO> selectOrderHistory(long accountId) throws SQLException;
	
}
