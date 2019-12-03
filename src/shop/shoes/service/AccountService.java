package shop.shoes.service;

import shop.shoes.model.AccountDTO;

public interface AccountService {
	
	/**
	 * 로그인
	 * @throws Exception 
	 * 
	 * */
	public int signin(AccountDTO account) throws Exception; 
	
	/**
	 * 회원가입
	 * 
	 * */
	public int signUp(AccountDTO account) throws Exception;
	
	/**
	 * 패스워드 찾기
	 * 
	 * */
	public int findPassword(AccountDTO account) throws Exception;
	
	// 세션 만료 확인 
	
	
	// ???
}
