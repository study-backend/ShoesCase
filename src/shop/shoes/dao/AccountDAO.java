package shop.shoes.dao;

import java.util.List;

import shop.shoes.model.AccountDTO;

public interface AccountDAO {
	/**
	 * ���̺� ��ü select
	 * ������ �Ӽ�(���̺��� �ʵ�)
	 * ��ȣ(id)
	 */
	List<AccountDTO> selectAll() throws Exception;
	
	/**
	 * ���� �߰�
	 * 
	 * 
	 */
	int insert(AccountDTO account) throws Exception;
	
	
	/**
	 * ����
	 * ����, ���� ����
	 */
	int update(AccountDTO account) throws Exception;
	
	
	/**
	 * ����
	 */
	int delete(int accountId) throws Exception;
}
