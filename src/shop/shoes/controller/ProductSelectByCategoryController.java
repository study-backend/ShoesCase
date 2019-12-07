package shop.shoes.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.GoodsDTO;
import shop.shoes.service.GoodsService;
import shop.shoes.service.GoodsServiceImpl;

public class ProductSelectByCategoryController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		GoodsService service = new GoodsServiceImpl();
		String categoryName = request.getParameter("categoryName");
		//System.out.println(categoryName);
		List<GoodsDTO> list = service.selectByCatagory(categoryName);
		//System.out.println(list);
		
		
		/**네이밍이랑 path는 나중에 정해지면 해보기
		 * 근데 굳이 각각의 페이지로 안가도 될거같은데.... 페이지 하나만 있어도 될거같은데 흠...
		 */
		request.setAttribute("list", list);
		ModelAndView mv = new ModelAndView();
//		if(categoryName.equals("sneakers")) {
//			mv.setViewName("sneakers.jsp");
//		}else if(categoryName.equals("dressShoes")) {
//			mv.setViewName("dressShoes.jsp");
//		}else if(categoryName.equals("sandal")) {
//			mv.setViewName("sandal.jsp");
//		}else if(categoryName.equals("boots")) {
//			mv.setViewName("boots.jsp");
//		}
		mv.setViewName("sneakers.jsp");
		
		return mv;
	}
}
