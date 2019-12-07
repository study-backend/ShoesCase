package shop.shoes.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.core.Logback;
import shop.shoes.model.AccountDTO;
import shop.util.UserSessionUtil;

/**
 * Servlet implementation class HomeDispatcherServlet
 */
@WebServlet("/shop")
public class HomeDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeDispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

//    @Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    	//Logback.debug("GET");
//    	process(req, resp);
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Logback.debug("POST???");
//		process(req, resp);
//	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Logback.debug("신발꽉 방문을 환영할거다 이메시지가 보이면 당신은 home으로 접속");
		
		boolean loginedUser = UserSessionUtil.isLogined(req.getSession());
		if(loginedUser == true) {
			// 당신은 로그인한 유저
			Logback.debug("로그인된 유저로 접속했습니다. 로그인한 사람은 ");
		
			
			
		} else {
			// 그냥 메인 화면
			Logback.debug("로그인되지 않은 유저다 ");
		
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/main.html");
		rd.forward(req, resp);
	}

}
