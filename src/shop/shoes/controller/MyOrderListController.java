package shop.shoes.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import shop.shoes.model.PurchaseGoodsDTO;
import shop.shoes.service.PurchaseService;
import shop.shoes.service.PurchaseServiceImpl;

public class MyOrderListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PurchaseService service = new PurchaseServiceImpl();
		
		String loginId = request.getParameter("");
		List<PurchaseGoodsDTO> myOrderList = service.selectOrderHistory(loginId);
		//request.setAttribute("myOrderList", myOrderList);
		
		JSONArray arr = JSONArray.fromObject(myOrderList); //json변환
		
		PrintWriter out = response.getWriter();
		
		out.println(arr); //출력해서 myOrderList.html에 출력
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("myOrderList.html");
		return mv;
	}

}
