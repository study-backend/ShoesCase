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
		List<GoodsDTO> list = service.selectByCatagory(categoryName);
		
		/**네이밍이랑 path는 나중에 정해지면 해보기
		 * 근데 굳이 각각의 페이지로 안가도 될거같은데.... 페이지 하나만 있어도 될거같은데 흠...
		 */
		request.setAttribute("list", list);
		ModelAndView mv = new ModelAndView();
		if(categoryName.equals("스니커즈")) {
			mv.setViewName("스니커즈페이지 ");
		}else if(categoryName.equals("구두")) {
			mv.setViewName("구두페이지");
		}else if(categoryName.equals("샌들")) {
			mv.setViewName("샌들페이지");
		}else if(categoryName.equals("부츠")) {
			mv.setViewName("부츠페이지");
		}
		return mv;
	}
}
