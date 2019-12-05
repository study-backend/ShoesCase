
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
import shop.shoes.service.PurchaseService;

public class UserRegisterController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String loginId = request.getParameter("id");

		String loginPwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		System.out.println(loginId + loginPwd + name + email);

		String phone = request.getParameter("mobileNum");
		String addr = request.getParameter("address_sub");

		String sexTest = request.getParameter("maleFemale");
		char sex;
		// if(sexTest.equals("m")) sex = '��'; //else sex='��'; //char sex =
		request.getParameter("sex_option").charAt(0);

		String birth_year = request.getParameter("birthYear");

		String birthMonth = request.getParameter("birthMonth");
		String birthDay = request.getParameter("birthDay"); // Date birthday =
		java.sql.Date.valueOf(birth_year + "-" + birthMonth + "-" + birthDay);

		AccountDTO dto = new AccountDTO(loginId, loginPwd, name, phone, email, addr, '1', null);
		AccountService service = new AccountServiceImpl();

		int result = service.signup(dto);
		if (result > 0) {
			System.out.println("성공");
		}
		// String path = request.getContentType(); ModelAndView mv = new
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main.html");

		return mv;
	}
}
