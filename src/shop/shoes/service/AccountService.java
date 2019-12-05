package shop.shoes.service;

import java.sql.SQLException;

import shop.shoes.common.GlobalException;
import shop.shoes.model.AccountDTO;

public interface AccountService {
	
	/**
	 * 로그인
	 * @throws Exception 
	 * 
	 * */
	public AccountDTO signin(AccountDTO account) throws GlobalException, SQLException; 
	
	/**
	 * 회원가입
	 * 
	 * */
	public int signup(AccountDTO account) throws Exception;
	

	
	/**
	 * 회원정보 수정
	 * */
	public int updateUserInfo(AccountDTO account) throws Exception;
	
	/**
	 * 회원정보 삭제
	 * */
	public int deleteUserInfo(AccountDTO account) throws Exception;
	
	// 세션 만료 확인 
	
	/**
	 * 아이디 찾기
	 * */
	public int idFind(String name, String email) throws Exception;
	
	/**
	 * 비밀번호 찾기
	 * */
	public int pwdFind(String name, String loginId, String email) throws Exception;

}
