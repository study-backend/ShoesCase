
package shop.shoes.service;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasketDTO;
import shop.shoes.model.PurchaseBasketPaymentDTO;
import shop.shoes.model.PurchaseGoodsDTO;
import shop.shoes.model.dto.PurchasePageDTO;

public interface PurchaseService {

	/**
	 * 상품 구매 (바스켓은 왜 DTO가 아니지??? PurchaseBasketPayment 도. 네이밍 수정 부탁)
	 * 아래 파라미터는 화면에서 오는 정보로 내부에서 사용하기 편하게 변경될 수 있음
	 * */
	
	public int insertPurchase(List<GoodsDTO> goodsList, PurchaseBasketDTO basket, 
			PurchaseBasketPaymentDTO payment, AccountDTO account,PurchaseGoodsDTO purchaseGoodsDTO) throws SQLException;
	
	/**
	 * 장바구니에서 구매 넘어갈때 들고갈 상품 정보(조회)
	 * 주문자 정보 조회
	 * 같이 뿌려주는 작업
	 * */
	public PurchasePageDTO selectProduct(String loginId, String billKey) throws SQLException;
	
	
	/**
	 * 구매내역 조회
	 * 
	 * */
	public List<PurchaseGoodsDTO> selectOrderHistory(String loginId) throws SQLException;
	
}
