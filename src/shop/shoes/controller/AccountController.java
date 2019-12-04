package shop.shoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.*;
import shop.shoes.service.AccountService;
import shop.shoes.service.AccountServiceImpl;

public class AccountController implements Controller{
	
	// 필요한 service를 여기서 만든다 
	private static AccountService accountService = new AccountServiceImpl();
	
	

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		//String uri = request.getRequestURI();
		//System.out.println(uri);
		
		// json 변환이 필요함
<<<<<<< HEAD
=======
		String route = request.getParameter("route");
>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
		String data = request.getParameter("data");
		System.out.println(route);
		
		// return 에 대한 부분 필요 
		String result = "";
		
		String httpMethod = request.getMethod();
		switch (httpMethod) {

			case "get": {

				switch(route) {
				
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
					// 로그인
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.signin(account);
						break;
					}
					
					case "findId" : {
						String name = request.getParameter("name");
						String email = request.getParameter("email");
						accountService.idFind(name, email);
					}
					
					case "findPwd" : {
						String name = request.getParameter("name");
						String loginId = request.getParameter("loginId");
						String email = request.getParameter("email");
						accountService.pwdFind(name, loginId, email);
					}

				}

				break;
			}
			case "post": {
				
				switch(route) {
				
<<<<<<< HEAD
=======
					// 로그인
					case "loginin": {	
						
						AccountDTO account = new AccountDTO();
						accountService.signin(account);
						break;
					}
					
>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
					// 회원 가입
					case "account": {	
						
						AccountDTO account = new AccountDTO();
						accountService.signUp(account);
						break;
					}
			}
				
				break;
			}
			case "patch" : {
				
				switch(route) {
				
					// 회원정보 수정
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.updateUserInfo(account);
						break;
					}
				}
				
				break;
			}
			case "delete" : {
				
				switch(route) {
				
					// 회원정보 삭제
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.deleteUserInfo(account);
						break;
					}
				}
				
				break;
			}
		}
		
		// result를 json으로 만들어 줘야 함 
		
		
		ModelAndView mv = new ModelAndView("NewFile.html", true, result);
		return mv;
	}

}
