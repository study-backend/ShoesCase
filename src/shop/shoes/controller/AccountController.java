package shop.shoes.controller;


import java.io.Console;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shop.core.Logback;
import shop.shoes.common.GlobalException;
import shop.shoes.common.ShopResponse;
import shop.shoes.common.StatusCode;
import shop.shoes.model.*;
import shop.shoes.model.request.LoginRequest;
import shop.shoes.model.request.SignupRequest;
import shop.shoes.service.AccountService;
import shop.shoes.service.AccountServiceImpl;
import shop.util.JsonUtil;

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
						LoginRequest req = JsonUtil.fromJson(data, LoginRequest.class);	
						AccountDTO account = new AccountDTO();
						account.setName(req.getName());
						account.setEmail(req.getEmail());
						
						String id = accountService.idFind(account.getName(), account.getEmail());
						
						System.out.println(JsonUtil.toJson(id));
		
						// 응답을 만든다
						mv.setResultData(true);
						ShopResponse res = new ShopResponse(StatusCode.Success, id);
						mv.setResult(JsonUtil.toJson(res));
						break;
					
					}
					
					case "findPwd" : {
						LoginRequest req = JsonUtil.fromJson(data, LoginRequest.class);	
						AccountDTO account = new AccountDTO();
						account.setName(req.getName());
						account.setEmail(req.getEmail());
						account.setLoginId(req.getLoginId());
	
						String pw = accountService.pwdFind(account.getName(), account.getLoginId(), account.getEmail());
						
						System.out.println("password : " + JsonUtil.toJson(pw));
						
						// 응답을 만든다
						mv.setResultData(true);
						ShopResponse res = new ShopResponse(StatusCode.Success, pw);
						mv.setResult(JsonUtil.toJson(res));
						break;
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
						
						AccountDTO user = accountService.signin(req.getLoginId(), req.getLoginPwd());
						System.out.println(JsonUtil.toJson(user));

				        if (user != null) {
				        	 HttpSession session = request.getSession();
				        	 user.setLoginPwd("");
				        	 user.setDeleteDate(null);
				        	 user.setUpdateDate(null);
				        	 user.setTermsAgreeDate(null);
					         session.setAttribute("user", user);
					         
					      // 응답을 만든다
					      mv.setResultData(true);
						  ShopResponse res = new ShopResponse(StatusCode.Success, JsonUtil.toJson(user));
						  mv.setResult(JsonUtil.toJson(res));
				        }else {
				        	
				        }

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
						
						int success = accountService.signup(account);
						
						
						// 회원가입은 로그인은 아니다..
						//if (success == 1) {
						//	HttpSession session = request.getSession();
						//	User loginedUser = new User(account.getLoginId(), account.getLoginPwd(), account.getName(), account.getEmail());
						//	session.setAttribute("user", loginedUser);
						//}
						
						 // 응답을 만든다
					      mv.setResultData(true);
						  ShopResponse res = new ShopResponse(success, "뭐가 필요할까???");
						  mv.setResult(JsonUtil.toJson(res));
						break;
					}
					
					// 패스워드 확인 후 회원정보 수정하기
					case "checkPassword": {	
						System.out.println("여기다");
						LoginRequest req = JsonUtil.fromJson(data, LoginRequest.class);		
		
						int success = accountService.checkPassword(req.getLoginId(), req.getLoginPwd());
						
					      mv.setResultData(true);
						  ShopResponse res = new ShopResponse(success, "뭐가 필요할까???");
						  mv.setResult(JsonUtil.toJson(res));
		
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
