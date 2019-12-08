package shop.shoes.dao;

import shop.shoes.model.BillKeyDTO;

public interface BillKeyDAO {
	
	
	public BillKeyDTO select(String billkey) throws Exception ;
	
	public int update(BillKeyDTO bill) throws Exception ;
	
	public int insert(BillKeyDTO bill) throws Exception ;
}
