package shop.shoes.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.service.AccountService;
import shop.shoes.service.AccountServiceImpl;

/**
 * Servlet implementation class IdDuplicate
 */
@WebServlet("/idCheck")
public class IdDuplicate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
		System.out.println("idcheck 컨트롤러호출!!!!");
		 response.setContentType("text/html;charset=UTF-8"); 
		AccountService service = new AccountServiceImpl();
		String id = request.getParameter("id");
		 boolean result=false;
		try {
		result = service.idDuplicate(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		 PrintWriter out = response.getWriter();
		 
		 if(result) out.print("아뒤 중복!");
		 else out.print("사용가능!");
	}

}
