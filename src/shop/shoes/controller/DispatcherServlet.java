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
		System.out.println(request.getRequestURI());
		//System.out.println(request.getRequestURL());
		
		//String uri = request.getRequestURI();
		//int length = uri.indexOf("/api/v1/"); 
		//String fullSentence = uri.substring((length + 8) , uri.length());
		//int size = fullSentence.indexOf("/");
		//System.out.println(size);
		//String resource = null;
		//if(size <= 0) {
		//	resource = fullSentence;
		//} else {
		//	resource = fullSentence.substring(fullSentence.indexOf("/"));
		//}
		//System.out.println(resource);
		
		if(key == null) 
			key = "home";
		
		try {
		   ModelAndView mv = map.get(key).handleRequest(request, response);

		   
		   System.out.println(mv.getViewName());
		   System.out.println("이동하자");
		   
		   if(mv.isRedirect()) {//redirect방식
				response.sendRedirect("NewFile.html");
			}else {//forward이동
				request.getRequestDispatcher(mv.getViewName()).forward(request, response);
			}
		
		}catch (Exception  e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
			request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
		}
		
		
		
	}

}









