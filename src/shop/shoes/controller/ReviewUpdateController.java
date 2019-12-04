/*
 * package shop.shoes.controller;
 * 
 * import java.io.IOException; import java.sql.SQLException;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import shop.shoes.service.ReviewService;
 * 
 * public class ReviewUpdateController implements Controller{
 * 
 * @Override public ModelAndView handleRequest(HttpServletRequest request,
 * HttpServletResponse response) throws SQLException, IOException {
 * System.out.println("리뷰 업데이트 ctrl 호출");
 * 
 * int reviewId =0; //값 받아야할 듯? String reviewPwd = ""; //값 받아야 할듯?
 * ReviewService.update(reviewId, reviewPwd);
 * 
 * //이미 db에 날라가고 데이터가 알아서 처리될 것임 //때문에 ajax로 통신해야 새로고침없이 화면 갱신될거같음
 * 
 * ModelAndView mv = new ModelAndView();
 * 
 * 
 * //화면 뿌리기 //return mv 해야함 return null;
 * 
 * }
 * 
 * }
 */