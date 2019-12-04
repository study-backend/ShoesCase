package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String loginId = request.getParameter("loginId");
		String loginPwd = request.getParameter("loginPwd");
		System.out.println(loginId + loginPwd +"³ª¿Í¶ó !!");
	
		return null;
	}

}
