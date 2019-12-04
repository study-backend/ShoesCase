package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.ReviewDTO;
import shop.shoes.service.ReviewService;

public class ReviewSelectController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		System.out.println("리뷰 select 컨트롤러 호출");
		
		
		try {
			List<ReviewDTO> list = ReviewService.selectAll(); //리뷰 list 받고
			request.setAttribute("reviewList", list); //set attribute 저장하는 name값 확인!!
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		ModelAndView mv = new ModelAndView();
//		mv.setRedirect(isRedirect); 이동방식, 화면어디로 ? 정하기
		
		
		
		//화면 뿌리기
		//return mv 해야함
		return null; 
	}

}
