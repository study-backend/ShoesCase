package shop.shoes.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.service.AccountService;
import shop.shoes.service.AccountServiceImpl;

public class IdDuplicateCheck implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("idcheck 컨트롤러 들어오는지 확인~");
		
		 response.setContentType("text/html;charset=UTF-8"); 
			AccountService service = new AccountServiceImpl();
			String id = request.getParameter("id");
			 boolean result=false;
			try {
			result = service.idDuplicate(id);
			}catch(Exception e) {
				e.printStackTrace();
			}
			// PrintWriter out = response.getWriter();
			 if(result) System.out.print("아뒤 중복!");
			 else System.out.print("사용가능!");
		return null;
	}

}
