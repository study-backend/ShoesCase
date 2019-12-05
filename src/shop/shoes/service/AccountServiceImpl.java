package shop.shoes.service;


import java.sql.SQLException;

import shop.shoes.common.GlobalException;
import shop.shoes.common.StatusCode;
import shop.shoes.dao.AccountDAO;
import shop.shoes.dao.AccountDAOImpl;
import shop.shoes.model.AccountDTO;

public class AccountServiceImpl implements AccountService {
	private static AccountDAO accountDAO  = new AccountDAOImpl();

	public AccountDTO signin(AccountDTO account) throws GlobalException, SQLException {

		AccountDTO acc = accountDAO.selectById(account.getLoginId());
		if (acc != null) {

			if (acc.getLoginPwd().equals(account.getLoginPwd()) == true) {

				// 추가검증 (ip?, 세션타임?.. 일단 pass


			} else {
				throw new GlobalException("계정이 없습니다", StatusCode.Not_Matched_Password);
			}

		} else {
			throw new GlobalException("계정이 없습니다", StatusCode.Not_Found_Id);
			
		}

		return acc;

	}

	public int signup(AccountDTO account)  throws Exception{
		int result = 0;
		result = accountDAO.insert(account);
		if(result == 1) {
			
			result = 1;
			
		} else {
			throw new GlobalException("계정 추가 실패", StatusCode.Fail_Add_Account);
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
