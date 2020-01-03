package shop.shoes.dao;

import java.util.List;

import shop.shoes.model.PurchaseGoodsDTO;

public interface PurchaseGoodsDAO {
	
	List<PurchaseGoodsDTO> selectByBasketId(long basketId);
	
	PurchaseGoodsDTO selectById(long purchaseGoodsId);
	
	int update(PurchaseGoodsDTO dto);
}
