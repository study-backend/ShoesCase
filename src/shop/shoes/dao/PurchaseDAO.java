package shop.shoes.dao;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasket;
import shop.shoes.model.PurchaseGoods;

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
	List<PurchaseGoods> selectProduct(String billKey) throws SQLException; //선택한 상품 정보 조회(select)
	
	AccountDTO selectOrderer() throws SQLException;
	
	int recieverInfo() throws SQLException;
	
	PurchaseBasket selectTotalPrice(int basketId) throws SQLException;
	
	int paymentWay() throws SQLException; 
	
	
	/**
	 * 장바구니 조회(select)
	 * */
	List<GoodsDTO> selectAllBasket() throws SQLException;
	
	
	/**
	 * 장바구니 삭제(delete) 제품 아이디 마다 삭제 가능하겠지??
	 * */
	int deleteBasket(GoodsDTO goods) throws SQLException;
	
	/**
	 * 마이컬리에서 주문내역 조회
	 * */
	List<PurchaseGoods> selectOrderHistory(AccountDTO account) throws SQLException;
	
}
