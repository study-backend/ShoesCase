package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet(urlPatterns = {"/front"} , loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, Controller> map;
	
    @Override
	public void init() throws ServletException {
		map=(Map<String, Controller>)getServletContext().getAttribute("map");
	}
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String key = request.getParameter("key");
		System.out.println(key);
		
		if(key==null) key = "login";
		
		try {
		   ModelAndView mv = map.get(key).handleRequest(request, response);
		   
		   if(mv.isRedirect()) {//redirect방식
				response.sendRedirect(mv.getViewName());
			}else {//forward이동
				request.getRequestDispatcher(mv.getViewName()).forward(request, response);
			}
		
		}catch (SQLException | IOException  e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
			request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
		}
		
		
		
	}

}









