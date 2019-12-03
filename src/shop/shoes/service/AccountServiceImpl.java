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
				
				// �߰����� (ip?, ����Ÿ��?.. �ϴ� pass
				result = 1;
				
			} else {
				throw new Exception("�н����尡 Ʋ���ϴ�");
			}
			
			
		} else {
			throw new Exception("������ �����ϴ�");
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
			throw new Exception("���� �߰� ����");
		}
		
		return result;
	}

	@Override
	public int findPassword(AccountDTO account)  throws Exception{
		int result = 0;
		AccountDTO acc = accountDAO.selectById(account.getAccountId());
		if(acc != null) {
			
			if(acc.getEmail().equals(account.getEmail()) == true) {
				
				// ��й�ȣ �ʱ�ȭ �̸��� �߼� ... �ϴ� ���� SMTP�� ���� ���� �ʿ�
				result = 1;
				
			} else {
				throw new Exception("�̸����� Ʋ���ϴ�");
			}
			
			
		} else {
			throw new Exception("������ �����ϴ�");
		}
		
		return result;
	}

}
