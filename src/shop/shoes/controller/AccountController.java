package shop.shoes.controller;

import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import shop.shoes.common.GlobalException;
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
		
		// return 에 대한 부분 필요 
		String result = "{}";
		

		
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
						
						if(code == 1) {
							result = "{ result : 1 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						} else {
							result = "{ result : 0 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						}
					}
					
					case "findPwd" : {
						String name = request.getParameter("name");
						String loginId = request.getParameter("loginId");
						String email = request.getParameter("email");
						int code = accountService.pwdFind(name, loginId, email);
						
						if(code == 1) {
							result = "{ result : 1 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						} else {
							result = "{ result : 0 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						}
					}

				}

				break;
			}
			case "POST": {
				
				switch(route) {
				
					// 로그인
					case "login": {	
	
						LoginRequest req = JsonUtil.fromJson(data, LoginRequest.class);		
						AccountDTO account = new AccountDTO();
						account.setLoginId(req.getLoginId());
						account.setLoginPwd(req.getLoginPwd());
						
						int r = accountService.signin(account);
						System.out.println(JsonUtil.toJson(r));

						mv.setViewName("id.html");
						mv.setRedirect(true);

						break;
					}
					
					// 회원 가입
					case "account": {	
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
						if(code == 1) {
							result = "{ result : 1 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						} else {
							result = "{ result : 0 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						}
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
						if(code == 1) {
							result = "{ result : 1 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						} else {
							result = "{ result : 0 }";
							mv.setViewName("what.html");
							mv.setRedirect(true);
							JSONArray json = JSONArray.fromObject(result);
							//mv.setResult(json);
							mv.setResultData(true);
							System.out.println(json.toString());
						}
							
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
