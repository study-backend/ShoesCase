package shop.shoes.dao;

import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasket;

public interface PurchaseDAO {

	/**
	 * 장바구니에서 구매하기 눌렀을 때 페이지
	 * 1. 선택한 상품 정보 조회(select)
	 * 
	 * 2. 주문자 정보 조회(select)
	 * 
	 * 3. 받는이 정보
	 * 
	 * 4. 결제수단 
	 * */
	List<PurchaseBasket> selectProduct(); //선택한 상품 정보 조회(select)
	
	List<AccountDTO> selectOrderer();
	
	int 
	
	
	
	/**
	 * 장바구니 조회(select)
	 * */
	List<E> selectAllBasket();
	
	
	/**
	 * 장바구니 삭제(delete) 제품 아이디 마다 삭제 가능하겠지??
	 * */
	int deleteBasket(GoodsDTO goods);
	
	/**
	 * 마이컬리에서 주문내역 조회
	 * */
	List<E> selectOrderHistory(AccountDTO account);
	
}
