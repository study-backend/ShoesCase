package shop.shoes.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.AccountDTO;
import shop.shoes.service.AccountService;
import shop.shoes.service.AccountServiceImpl;
import shop.shoes.service.ShoesShopService;

public class UserRegisterController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String loginId  = request.getParameter("id");
		String loginPwd  = request.getParameter("pwd");
		String name  = request.getParameter("name");
		String email  = request.getParameter("email");
		String phone  = request.getParameter("mobileInp");
		String addr  = request.getParameter("address_sub");
		char sex  = request.getParameter("sex_option").charAt(0);
		
		String birth_year  = request.getParameter("birth_year");
		String birth  = request.getParameter("birth[]"); 
		Date birthday = java.sql.Date.valueOf(birth_year + birth);
		
		AccountDTO dto = new AccountDTO(loginId, loginPwd, name, phone, email, addr, sex, birthday);
		AccountService service = new AccountServiceImpl();
		
		int result = service.signUp(dto);
		if(result>0){
			System.out.println("성공");
		}
		ModelAndView mv = new ModelAndView("../loginForm.jsp", true);
		return mv;
	}
	//회원가입
}

