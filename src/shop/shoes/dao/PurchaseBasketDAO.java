package shop.shoes.dao;

import shop.shoes.model.PurchaseBasketDTO;

public interface PurchaseBasketDAO {

	PurchaseBasketDTO selectByBillkey(String billKey);
	
	int update(PurchaseBasketDTO dto);
}
