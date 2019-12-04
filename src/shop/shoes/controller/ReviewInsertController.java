package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.ReviewDTO;
import shop.shoes.service.ReviewService;

public class ReviewInsertController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		
		//넘어오는 값 받기 & 프론트와 네임값 같이 설정하고 뭐뭐넘어올지 확인 필요
		/*
		 * 예상 되는 값 : 제목 내용 만족도 
		 * String title = request.getParameter("네임값");
		 * String content = request.getPrameter("네임값");
		 * String score = request.getPrameter("네임값");
		 */
		
		
		
		//넘오는 값만 인수로 받는 ReviewDTO 생성자 오버로딩 필요할듯 
		/*ReviewDTO reviewDTO = new ReviewDTO
		 (reviewId, goodsId, accountId, title, content, score, createDate, updateDate);
		
		 *  
		 */
		
//		reviewdto를 insert하기
//		ReviewService.insert(reviewDTO);
		
		//이미 db에 날라가고 데이터가 알아서 처리될 것임
		//때문에 ajax로 통신해야 새로고침없이 화면 갱신될거같음
		
		ModelAndView mv = new ModelAndView();
		
		
		//화면 뿌리기
		//return mv 해야함
		return null; 
	}

}
