package shop.shoes.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
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
		String route = request.getParameter("route");
		String data = request.getParameter("data");
		System.out.println(route);
		//System.out.println(data);
		
		// return 에 대한 부분 필요 
		String result = "{}";
		
		
		
		ModelAndView mv = new ModelAndView();
		
		String httpMethod = request.getMethod();
		switch (httpMethod) {

			case "get": {

				switch(route) {
				

					// 로그인
					case "account": {	
						AccountDTO account = new AccountDTO();
						int code = accountService.signin(account);
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
			case "post": {
				
				switch(route) {
				
					// 로그인
					case "loginin": {	
						
						AccountDTO account = new AccountDTO();
						int code = accountService.signin(account);
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
					
					// 회원 가입
					case "account": {	
						
						AccountDTO account = new AccountDTO();
						int code = accountService.signUp(account);
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
			case "patch" : {
				
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
			case "delete" : {
				
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
