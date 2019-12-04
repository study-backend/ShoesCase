package shop.shoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.*;
import shop.shoes.service.AccountService;
import shop.shoes.service.AccountServiceImpl;

public class AccountController implements Controller{
	
	// �ʿ��� service�� ���⼭ ����� 
	private static AccountService accountService = new AccountServiceImpl();
	
	

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		//String uri = request.getRequestURI();
		//System.out.println(uri);
		
		// json ��ȯ�� �ʿ���
		String data = request.getParameter("data");
		
		// return �� ���� �κ� �ʿ� 
		String result = "";
		
		String httpMethod = request.getMethod();
		switch (httpMethod) {

			case "get": {

				switch(data) {
				
					// �α���
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.signin(account);
						break;
					}
				}

				break;
			}
			case "post": {
				
				switch(data) {
				
					// ȸ�� ����
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.signUp(account);
						break;
					}
			}
				
				break;
			}
			case "patch" : {
				
				switch(data) {
				
					// ȸ������ ����
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.updateUserInfo(account);
						break;
					}
				}
				
				break;
			}
			case "delete" : {
				
				switch(data) {
				
					// ȸ������ ����
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.deleteUserInfo(account);
						break;
					}
				}
				
				break;
			}
		}
		
		// result�� json���� ����� ��� �� 
		
		
		ModelAndView mv = new ModelAndView("NewFile.html", true, result);
		return mv;
	}

}
