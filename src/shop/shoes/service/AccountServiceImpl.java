package shop.shoes.service;

import java.util.List;

import shop.shoes.dao.AccountDAO;
import shop.shoes.dao.AccountDAOImpl;
import shop.shoes.model.AccountDTO;

public class AccountServiceImpl implements AccountService {
	private static AccountDAO accountDAO  = new AccountDAOImpl();

	@Override
	public int signin(AccountDTO account) throws Exception {
		
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

	@Override
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

	@Override
	public int findPassword(AccountDTO account)  throws Exception{
		int result = 0;
		AccountDTO acc = accountDAO.selectById(account.getAccountId());
		if(acc != null) {
			
			if(acc.getEmail().equals(account.getEmail()) == true) {
				
				// 비밀번호 초기화 이메일 발송 ... 일단 보류 SMTP를 통한 구현 필요
				result = 1;
				
			} else {
				throw new Exception("이메일이 틀립니다");
			}
			
			
		} else {
			throw new Exception("계정이 없습니다");
		}
		
		return result;
	}

}
