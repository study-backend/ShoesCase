package shop.shoes.dao;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasketDTO;
import shop.shoes.model.PurchaseBasketPaymentDTO;
import shop.shoes.model.PurchaseGoodsDTO;

public interface PurchaseDAO {

	/**
	 * 장바구니에서 구매하기 눌렀을 때 페이지
	 * 1. 선택한 상품 정보 조회(select)
	 * 
	 * 2. 주문자 정보 조회(select)
	 * 
	 * 3. 받는이 정보
	 * 
	 * 4. 결제수단 (총금액 출력 되고 밑에 결제수단)
	 * */


	List<PurchaseGoodsDTO> selectProduct(String billKey) throws Exception; //선택한 상품 정보 조회(select)

	
	AccountDTO selectOrderer(String loginId) throws Exception;
	
	int recieverInfo(PurchaseBasketPaymentDTO pbp) throws Exception;
	
	int paymentWay(int paymentType) throws SQLException; 
	
	int insertPurchaseGoods(PurchaseGoodsDTO purchaseGoods) throws Exception;
	
	
	/**
	 * 장바구니 정보 넣어주기(insert)
	 * */
	int insertBasket(PurchaseBasketDTO basket) throws Exception;
	
	/**
	 * 결제한 정보 넣어주기( DAO 분리가 필요... )
	 * */
	int insertPayment(PurchaseBasketPaymentDTO payment) throws Exception;
	
	/**
	 * 빌키로 바스켓 정보 조회하기
	 * */
	long selectBasketId(String billKey) throws Exception;

	
	/**
	 * 장바구니 조회(select)
	 * 마이컬리에서 주문내역 조회
	 * */

//	List<GoodsDTO> selectAllBasket(String billKey) throws Exception;
	
	
//	/**
//	 * 환불 나중에!!!
//	 * */
//	int deletePurchase(PurchaseGoods purchaseGoods) throws Exception
	
	/**
	 * 마이컬리에서 주문내역 조회
	 * */
	List<PurchaseGoodsDTO> selectOrderHistory(String loginId) throws Exception;

	
}
