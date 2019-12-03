package shop.shoes.dao;

import java.util.List;

public interface DAO<T> {
	/**
	 * ���� ���̺� ��ü select
	 * ������ �Ӽ�(���̺��� �ʵ�)
	 * ��ȣ(id), ����, ����, �ۼ���, �ۼ��� ����
	 */
	List<T> selectAll();
	
	/**
	 * �ı� �ۼ�
	 * ��ȣ, �ۼ���, �ۼ��� �ڵ�����
	 * ����, ���븸 ��� �ۼ�
	 * 
	 */
	int insert(T reviewDto);
	
	
	/**
	 * ����
	 * ����, ���� ����
	 */
	int update(T reviewDto);
	
	
	/**
	 * ����
	 */
	int delete(int id);
	
}