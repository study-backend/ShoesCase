package shop.shoes.service;

import java.util.List;

import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasket;
import shop.shoes.model.PurchaseBasketPayment;

public interface PurchaseService {

	/**
	 * 상품 구매 (바스켓은 왜 DTO가 아니지??? PurchaseBasketPayment 도. 네이밍 수정 부탁)
	 * 아래 파라미터는 화면에서 오는 정보로 내부에서 사용하기 편하게 변경될 수 있음
	 * */
	
	public int insertPurchase(List<GoodsDTO> goodsList, PurchaseBasket basket, PurchaseBasketPayment payment);
	
}
