package shop.shoes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import shop.shoes.model.ReviewDTO;
import shop.shoes.service.ReviewService;

public class ReviewSelectController implements Controller {

	@Override public ModelAndView handleRequest(HttpServletRequest request,
												HttpServletResponse response) throws SQLException, IOException {
		System.out.println("리뷰 select 컨트롤러 호출");

		List<ReviewDTO> list=null;

		try {
			list = ReviewService.selectAll(); //리뷰 list 받고
			request.setAttribute("list", list); //list라는 name으로 list데이터 저장

		}catch(SQLException e) { e.printStackTrace(); }

		//  System.out.println(list.toString());
		/*
		 * //javaScript가 알수 있는 json 형태로 list를 변환해서 전송 JSONArray result =
		 * JSONArray.fromObject(list);
		 *
		 * PrintWriter out = response.getWriter();
		 *
		 * out.print(result);
		 *
		 * select는 ajax안하고 request, response로 함
		 */

		//   ModelAndView mv= new ModelAndView();
		//   mv.setViewName("datailPage.html");
		ModelAndView mv = new ModelAndView("detailPageTest.jsp", false);



		//화면 뿌리기
		return mv;
	}
}