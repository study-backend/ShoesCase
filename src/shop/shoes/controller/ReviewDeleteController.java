
package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.service.ReviewService;

public class ReviewDeleteController implements Controller {

   @Override public ModelAndView handleRequest(HttpServletRequest request,
   HttpServletResponse response) throws SQLException, IOException {
   System.out.println("리뷰 delete 컨트롤러 호출"); 
   
   String reviewId =request.getParameter("reviewId"); //값 받아야할 듯? String
   String reviewPwd=""; //리뷰 패스워드 어떻게 받을지 ?
   
   System.out.println(reviewId); 
   
  
   //이미 db에 날라가고 데이터가 알아서 처리될 것임 //때문에 ajax로 통신해야 새로고침없이 화면 갱신될거같음
  
   int result= ReviewService.delete(Integer.parseInt(reviewId), reviewPwd);
   
  System.out.println(result);
  
   ModelAndView mv = new ModelAndView();
   
   mv.setViewName("detailPage.jsp");
   
   //화면 뿌리기 //return mv 해야함 return null; }
   return mv;
   }
}