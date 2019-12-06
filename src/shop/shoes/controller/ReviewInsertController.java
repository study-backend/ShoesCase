
package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.ReviewDTO;
import shop.shoes.service.ReviewService;

public class ReviewInsertController implements Controller {

	@Override public ModelAndView handleRequest(HttpServletRequest request,
   HttpServletResponse response) throws SQLException, IOException {
   
   //넘어오는 값 받기 & 프론트와 네임값 같이 설정하고 뭐뭐넘어올지 확인 필요
   
  /* 예상 되는 값 : 제목 내용 만족도 */
   String title = request.getParameter("title"); 
   int score = Integer.parseInt(request.getParameter("score")); 
   String content = request.getParameter("content"); 
   String reviewPwd = request.getParameter("reviewPwd");
   
   System.out.println("title : " + title +"score : "+score +"content : " +content +"리뷰비번 : " +reviewPwd );
   
   
   //넘오는 값만 인수로 받는 ReviewDTO 생성자 오버로딩 필요할듯 ReviewDTO reviewDTO = new ReviewDTO
/*   (reviewId, goodsId, accountId, title, content, score, createDate,
   updateDate);*/
   
   ReviewDTO reviewDTO = new ReviewDTO(reviewPwd, title,  score, content);
   

	
   
   ReviewService.insert(reviewDTO);
   
   
   
   // reviewdto를 insert하기 // ReviewService.insert(reviewDTO);
   
   //이미 db에 날라가고 데이터가 알아서 처리될 것임 //때문에 ajax로 통신해야 새로고침없이 화면 갱신될거같음

   ModelAndView mv = new ModelAndView("detailPageTest.jsp", false);
   //화면 뿌리기 //return mv 해야함 return null; }
   return mv;
   
   }
}
