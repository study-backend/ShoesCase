
package shop.shoes.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
		System.out.println("어카운트 등록 컨트롤러 호출");
		String loginId = request.getParameter("id");

		String loginPwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		
		String phone = request.getParameter("mobileNum");
		String addr = request.getParameter("juso");
		
		
		String sexTest = request.getParameter("maleFemale");
		System.out.println("넘어온 성별 (m/ or w) value = "+sexTest);
		
		char sex;
		if(sexTest.equals("m")) sex = '남';
		else sex='여';
		
	//	request.getParameter("sex_option").charAt(0);

		String year = request.getParameter("birthYear");

		String month = request.getParameter("birthMonth");
		String day	 = request.getParameter("birthDay");
		
		String birth = year+"-"+month+"-"+day;
		Date birthday = Date.valueOf(birth);
		
		AccountDTO dto = new AccountDTO(loginId, loginPwd, name, phone, email, addr, sex, birthday);
		AccountService service = new AccountServiceImpl();

		int result = service.signup(dto);
		if (result > 0) {
			System.out.println("성공");
		}
	//	PrintWriter out = response.getWriter();
	//	out.print(result); 
		// String path = request.getContentType(); ModelAndView mv = new
		ModelAndView mv = new ModelAndView();
		mv.setViewName("mainTest_1.jsp");

		return mv;
	}
}
