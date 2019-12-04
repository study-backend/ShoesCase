<<<<<<< Updated upstream
<<<<<<< Updated upstream
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


	List<PurchaseGoodsDTO> selectProduct(String billKey) throws SQLException; //선택한 상품 정보 조회(select)

	
	AccountDTO selectOrderer(String loginId) throws SQLException;
	
	int recieverInfo(PurchaseBasketPaymentDTO pbp) throws SQLException;
	
	int paymentWay(int paymentType) throws SQLException; 
	
	int insertPurchaseInfo(PurchaseGoodsDTO purchaseGoods) throws SQLException;
	
	
	/**
	 * 장바구니 정보 넣어주기(insert)
	 * */
	int insertAllBasket(PurchaseBasketDTO basket) throws SQLException;
	

	
	/**
	 * 장바구니 조회(select)
	 * 마이컬리에서 주문내역 조회
	 * */

//	List<GoodsDTO> selectAllBasket(String billKey) throws SQLException;
	
	
//	/**
//	 * 환불 나중에!!!
//	 * */
//	int deletePurchase(PurchaseGoods purchaseGoods) throws SQLException
	
	/**
	 * 마이컬리에서 주문내역 조회
	 * */

	List<PurchaseGoodsDTO> selectOrderHistory(long accountId) throws SQLException;
	
}
=======
=======
>>>>>>> Stashed changes
//package shop.shoes.dao;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import shop.shoes.model.AccountDTO;
//import shop.shoes.model.GoodsDTO;
//import shop.shoes.model.PurchaseBasketDTO;
//import shop.shoes.model.PurchaseBasketPaymentDTO;
//import shop.shoes.model.PurchaseGoodsDTO;
//
//public interface PurchaseDAO {
//
//	/**
//	 * 장바구니에서 구매하기 눌렀을 때 페이지
//	 * 1. 선택한 상품 정보 조회(select)
//	 * 
//	 * 2. 주문자 정보 조회(select)
//	 * 
//	 * 3. 받는이 정보
//	 * 
//	 * 4. 결제수단 (총금액 출력 되고 밑에 결제수단)
//	 * */
//<<<<<<< HEAD
//	List<PurchaseGoods> selectProduct(String billKey) throws SQLException; //선택한 상품 정보 조회(select)
//=======
//	List<PurchaseGoodsDTO> selectProduct(String billKey) throws SQLException; //선택한 상품 정보 조회(select)
//>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
//	
//	AccountDTO selectOrderer() throws SQLException;
//	
//	int recieverInfo(PurchaseBasketPaymentDTO pbp) throws SQLException;
//	
//	int paymentWay(String paymentType) throws SQLException; 
//	
//	
////	/**
////	 * 장바구니 조회(select)
////	 * */
////	List<GoodsDTO> selectAllBasket(String billKey) throws SQLException;
//	
//	
////	/**
////	 * 환불기능
////	 * */
////	int deletePurchase(PurchaseGoods purchaseGoods) throws SQLException;
//	
//	/**
//<<<<<<< HEAD
//	 * 장바구니 조회(select)
//=======
//	 * 마이컬리에서 주문내역 조회
//>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
//	 * */
//<<<<<<< HEAD
//	List<GoodsDTO> selectAllBasket(String billKey) throws SQLException;
//	
//	
//	/**
//	 * 장바구니 삭제(delete) 제품 아이디 마다 삭제 가능하겠지??
//	 * */
//	int deleteBasket(GoodsDTO goods) throws SQLException;
//	
//	/**
//	 * 마이컬리에서 주문내역 조회
//	 * */
//	List<PurchaseGoods> selectOrderHistory(AccountDTO account) throws SQLException;
//=======
//	List<PurchaseGoodsDTO> selectOrderHistory(long accountId) throws SQLException;
//>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
//	
//}
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
