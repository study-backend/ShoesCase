package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.AccountDTO;
import shop.shoes.service.ShoesShopService;

public class UserRegisterController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		
		String loginId  = request.getParameter("id");
		String loginPwd  = request.getParameter("pwd");
		String name  = request.getParameter("name");
		String email  = request.getParameter("email");
		String phone  = request.getParameter("mobileInp");
		String addr  = request.getParameter("address_sub");
		String sex  = request.getParameter("sex_option");
		String birth_year  = request.getParameter("birth_year");
		String birth  = request.getParameter("birth[]"); 
		String birthday = birth_year + birth;
		AccountDTO dto = new AccountDTO(0, loginId, loginPwd, name, phone, email, addr, sex, birthday, null, null, 0, null, null, null, null)
		ShoesShopService service = new ShoesShopService();
		
		return null;
	}
	//회원가입
}
