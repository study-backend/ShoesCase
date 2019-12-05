package shop.shoes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

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
@WebServlet(urlPatterns = { "/api/v1" }, loadOnStartup = 1)
public class RestDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, Controller> map;

	@Override
	public void init() throws ServletException {
		ServletContext application = super.getServletContext();
		Map<String, Controller> object = (Map<String, Controller>) application.getAttribute("map");

		this.map = (Map<String, Controller>) object;

		System.out.println("DispatcherServlet start");

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String key = request.getParameter("resource");
		System.out.println(key);
		//System.out.println(request.getParameter("data"));
		//System.out.println(request.getRequestURL());

		// String uri = request.getRequestURI();
		// int length = uri.indexOf("/api/v1/");
		// String fullSentence = uri.substring((length + 8) , uri.length());
		// int size = fullSentence.indexOf("/");
		// System.out.println(size);
		// String resource = null;
		// if(size <= 0) {
		// resource = fullSentence;
		// } else {
		// resource = fullSentence.substring(fullSentence.indexOf("/"));
		// }
		// System.out.println(resource);

		if (key == null)
			key = "home";

		try {
			ModelAndView mv = map.get(key).handleRequest(request, response);

			System.out.println(mv.getViewName());
			// System.out.println("이동하자");

			if (mv.isResultData() == true) {
				PrintWriter out = response.getWriter();
				out.println(mv.getResult());
			}

//		   if(mv.isRedirect()) {//redirect방식
//				response.sendRedirect("login.html");
//		   }else {//forward이동
//				request.getRequestDispatcher("login.html").forward(request, response);
//			}

		} catch (GlobalException e) {
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
