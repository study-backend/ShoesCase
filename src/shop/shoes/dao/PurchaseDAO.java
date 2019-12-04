package shop.shoes.dao;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasket;
import shop.shoes.model.PurchaseGoods;

public interface PurchaseDAO {

	
	/**
	 * ��ٱ��Ͽ��� �����ϱ� ������ �� ������
	 * 1. ������ ��ǰ ���� ��ȸ(select)
	 * 
	 * 2. �ֹ��� ���� ��ȸ(select)
	 * 
	 * 3. �޴��� ����
	 * 
	 * 4. �������� (�ѱݾ� ��� �ǰ� �ؿ� ��������)
	 * */
	List<PurchaseGoods> selectProduct(String billKey) throws SQLException; //������ ��ǰ ���� ��ȸ(select)
	
	AccountDTO selectOrderer() throws SQLException;
	
	int recieverInfo() throws SQLException;
	
	PurchaseBasket selectTotalPrice(int basketId) throws SQLException;
	
	int paymentWay() throws SQLException; 
	
	
	/**
	 * ��ٱ��� ��ȸ(select)
	 * */
	List<GoodsDTO> selectAllBasket() throws SQLException;
	
	
	/**
	 * ��ٱ��� ����(delete) ��ǰ ���̵� ���� ���� �����ϰ���??
	 * */
	int deleteBasket(GoodsDTO goods) throws SQLException;
	
	/**
	 * �����ø����� �ֹ����� ��ȸ
	 * */
	List<PurchaseGoods> selectOrderHistory(AccountDTO account) throws SQLException;
	
}
