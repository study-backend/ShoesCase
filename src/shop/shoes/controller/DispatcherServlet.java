package shop.shoes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.common.GlobalException;
import shop.shoes.common.ShopResponse;
import shop.util.JsonUtil;


/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet(urlPatterns = {"/front"} , loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, Controller> map;
	
    @Override
	public void init() throws ServletException {
    	ServletContext application = super.getServletContext();
    	Map<String, Controller> object = (Map<String, Controller>)application.getAttribute("map");
		
		this.map = (Map<String, Controller>)object;
    	
    	System.out.println("DispatcherServlet start");
		
	}
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String key = request.getParameter("resource");
		System.out.println(key);
		//System.out.println(request.getParameter("data"));

		
		ModelAndView mv = null;
		if(key == null) 
			key = "home";
		
		try {
		    mv = map.get(key).handleRequest(request, response);
 
		   
		   if(mv.isRedirect()) {//redirect방식
				response.sendRedirect(mv.getViewName());
		   }else {//forward이동
				request.getRequestDispatcher(mv.getViewName()).forward(request, response);
			}
		
		}catch (GlobalException  e) {
			e.printStackTrace();
			
			ShopResponse res = new ShopResponse(e.getResultCode(), e.getMessage());
			PrintWriter out = response.getWriter();
			out.println(JsonUtil.toJson(res));
			
			// 이렇게 줘야 할까??
			request.setAttribute("errorMsg", res);
			request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
			request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
		} 
		
		
		
	}

}









