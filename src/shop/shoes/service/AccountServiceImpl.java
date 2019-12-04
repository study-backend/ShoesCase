package shop.shoes.service;

import java.util.List;

import shop.shoes.dao.AccountDAO;
import shop.shoes.dao.AccountDAOImpl;
import shop.shoes.model.AccountDTO;

public class AccountServiceImpl implements AccountService {
	private static AccountDAO accountDAO  = new AccountDAOImpl();

	public int  signin(AccountDTO account) throws Exception {
		
		int result = 0;
		AccountDTO acc = accountDAO.selectById(account.getAccountId());
		if(acc != null) {
			
			if(acc.getLoginPwd().equals(account.getLoginPwd()) == true) {
				
				// 추가검증 (ip?, 세션타임?.. 일단 pass
				result = 1;
				
			} else {
				throw new Exception("패스워드가 틀립니다");
			}
			
			
		} else {
			throw new Exception("계정이 없습니다");
		}
		
		return result;
		
	}

	public int signUp(AccountDTO account)  throws Exception{
		int result = 0;
		result = accountDAO.insert(account);
		if(result == 1) {
			
			result = 1;
			
		} else {
			throw new Exception("계정 추가 실패");
		}
		return result;
	}
	

	
	public int updateUserInfo(AccountDTO account) throws Exception {
		int result = 0;
		result = accountDAO.update(account);
		if(result == 1) {
			result = 1;
		} else {
			throw new Exception("계정 수정 실패");
		}
		return result;
	}

	@Override
	public int deleteUserInfo(AccountDTO account) throws Exception {
		int result = 0;
		result = accountDAO.delete(account.getAccountId());
		if(result == 1) {
			result = 1;
		} else {
			throw new Exception("계정 수정 실패");
		}
		return result;
	}

	@Override
	public int idFind(String name, String email) throws Exception {
		int result = 0;
		result = accountDAO.idFind(name, email);
		if(result == 1) {
			result = 1;
		} else {
			throw new Exception("아이디 찾기 실패");
		}
		return result;
	}

	@Override
	public int pwdFind(String name, String loginId, String email) throws Exception {
		int result = 0;
		result = accountDAO.pwdFind(name, loginId, email);
		if(result == 1) {
			result = 1;
		} else {
			throw new Exception("비밀번호 찾기 실패");
		}
		return result;
	}

}
