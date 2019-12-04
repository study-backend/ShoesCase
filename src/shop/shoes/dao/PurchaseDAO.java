package shop.shoes.dao;

import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasket;

public interface PurchaseDAO {

	/**
	 * ��ٱ��Ͽ��� �����ϱ� ������ �� ������
	 * 1. ������ ��ǰ ���� ��ȸ(select)
	 * 
	 * 2. �ֹ��� ���� ��ȸ(select)
	 * 
	 * 3. �޴��� ����
	 * 
	 * 4. �������� 
	 * */
	List<PurchaseBasket> selectProduct(); //������ ��ǰ ���� ��ȸ(select)
	
	List<AccountDTO> selectOrderer();
	
	int 
	
	
	
	/**
	 * ��ٱ��� ��ȸ(select)
	 * */
	List<E> selectAllBasket();
	
	
	/**
	 * ��ٱ��� ����(delete) ��ǰ ���̵� ���� ���� �����ϰ���??
	 * */
	int deleteBasket(GoodsDTO goods);
	
	/**
	 * �����ø����� �ֹ����� ��ȸ
	 * */
	List<E> selectOrderHistory(AccountDTO account);
	
}
