package shop.shoes.service;

import shop.shoes.model.AccountDTO;

public interface AccountService {
	
	/**
	 * �α���
	 * @throws Exception 
	 * 
	 * */
	public int signin(AccountDTO account) throws Exception; 
	
	/**
	 * ȸ������
	 * 
	 * */
	public int signUp(AccountDTO account) throws Exception;
	
	/**
	 * �н����� ã��
	 * 
	 * */
	public int findPassword(AccountDTO account) throws Exception;
	
	// ���� ���� Ȯ�� 
	
	
	// ???
}
