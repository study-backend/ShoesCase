package shop.shoes.controller;


import java.sql.Date;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shop.shoes.common.GlobalException;
import shop.shoes.model.*;
import shop.shoes.model.request.LoginRequest;
import shop.shoes.model.request.SignupRequest;
import shop.shoes.service.AccountService;
import shop.shoes.service.AccountServiceImpl;
import shop.util.JsonUtil;
import shop.util.User;

public class AccountController implements Controller{
	
	// 필요한 service를 여기서 만든다 
	private static AccountService accountService = new AccountServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws GlobalException, Exception {
			
		//String uri = request.getRequestURI();
		//System.out.println(uri);		
		// json 변환이 필요함
		String route = request.getParameter("route");
		String data = request.getParameter("data");
		System.out.println(route);
		//System.out.println(data);
		
		ModelAndView mv = new ModelAndView();
		
		String httpMethod = request.getMethod();
		System.out.println(httpMethod);
		switch (httpMethod) {

			case "GET": {

				switch(route) {
					
					case "findId" : {
						String name = request.getParameter("name");
						String email = request.getParameter("email");
						int code = accountService.idFind(name, email);
						
					
					}
					
					case "findPwd" : {
						String name = request.getParameter("name");
						String loginId = request.getParameter("loginId");
						String email = request.getParameter("email");
						int code = accountService.pwdFind(name, loginId, email);
						
					
					}

				}

				break;
			}
			case "POST": {
				
				switch(route) {
				
					// 로그인
					case "login": {	
						// 후.. 노가다..
						LoginRequest req = JsonUtil.fromJson(data, LoginRequest.class);		
						AccountDTO account = new AccountDTO();
						account.setLoginId(req.getLoginId());
						account.setLoginPwd(req.getLoginPwd());
						
						AccountDTO user = accountService.signin(account);
						System.out.println(JsonUtil.toJson(user));

				        if (user != null) {
				        	 HttpSession session = request.getSession();
				        	 User loginedUser = new User(user.getLoginId(), user.getLoginPwd(), user.getName(), user.getEmail());
					         session.setAttribute("user", loginedUser);
				        }

						mv.setViewName("login.html");
						mv.setRedirect(true);

						break;
					}
					
					// 회원 가입
					case "account": {	
						// 이름 맞추면 기존걸로 바로 가능할 텐데....
						SignupRequest req = JsonUtil.fromJson(data, SignupRequest.class);		
						AccountDTO account = new AccountDTO();
						account.setLoginId(req.getId());
						account.setLoginPwd(req.getPwd());
						account.setName(req.getName());
						account.setEmail(req.getEmail());
						account.setPhone(req.getMobileNum());
						account.setBirthday(new Date(Integer.parseInt(req.getBirthYear()), Integer.parseInt(req.getBirthMonth()), Integer.parseInt(req.getBirthDay()) ));
						account.setCreteDate(new Date(Calendar.getInstance().getTime().getTime()));
						account.setUpdateDate(new Date(Calendar.getInstance().getTime().getTime()));
						account.setTermsAgreeDate(new Date(Calendar.getInstance().getTime().getTime()));
						account.setDeleteDate(Date.valueOf("1900-01-01"));
						account.setAddr("우리집");
						
						int code = accountService.signup(account);
						System.out.println(JsonUtil.toJson(code));
						mv.setViewName("login.html");
						mv.setRedirect(false);
		
						break;
					}
			}
				
				break;
			}
			case "PATCH" : {
				
				switch(route) {
				
					// 회원정보 수정
					case "account": {	
						AccountDTO account = new AccountDTO();
						int code = accountService.updateUserInfo(account);
						
						break;
					}
				}
				
				break;
			}
			case "DELETE" : {
				
				switch(route) {
				
					// 회원정보 삭제
					case "account": {	
						AccountDTO account = new AccountDTO();
						int code = accountService.deleteUserInfo(account);
					
							
						break;
					}
				}
				
				break;
			}
		}
		
		// result를 json으로 만들어 줘야 함 
		
		
		
		return mv;
	}

}
