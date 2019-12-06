

package shop.shoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.*;
import shop.shoes.model.dto.GoodsMainDTO;
import shop.shoes.model.request.LoginRequest;
import shop.shoes.service.AccountService;
import shop.shoes.service.GoodsService;
import shop.shoes.service.GoodsServiceImpl;
import shop.util.JsonUtil;
import shop.util.User;
import shop.util.UserSessionUtil;

public class GoodsController implements Controller{
	
	// 필요한 service를 여기서 만든다 
	private static GoodsService goodsService = new GoodsServiceImpl();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		//String uri = request.getRequestURI();
		//System.out.println(uri);
		
		User user = UserSessionUtil.getUserFromSession(request.getSession());
		
		// json 변환이 필요함
		String route = request.getParameter("route");
		String data = request.getParameter("data");
		System.out.println(route);
		System.out.println(user);
		
		ModelAndView mv = new ModelAndView();
		
		String httpMethod = request.getMethod();
		System.out.println(httpMethod);
		switch (httpMethod) {

			case "GET": {

				switch(route) {
					// 상품 정보 가져오기
					case "goodsMain": {	
						
						GoodsMainDTO dto = goodsService.goodsMain();
						String json = JsonUtil.toJson(dto);
						System.out.println(json);
						mv.setResultData(true);
						mv.setResult(json);
						break;
					}
					case "goodsSub": {
						//goodsService.goodsSub(1);
						break;
					}
					case "goodsDetail": {

						//goodsService.goodsDetail(1);
						break;
					}
				}

				break;
			}
			case "POST": {
				
				switch(route) {
				
					
					// 상품정보 입력
					case "goods": {	
						
						goodsService.insertGoodsList();
						break;
					}
			}
				
				break;
			}
			case "PATCH" : {
				
				switch(route) {
				
					
					// 
					case "goods": {	
						
						break;
					}
				}
				
				break;
			}
			case "DELETE" : {
				
				switch(route) {
				
					
					// 상품 삭제
					case "goods": {	
						
						break;
					}
				}
				
				break;
			}
		}
		
		// result를 json으로 만들어 줘야 함 
		
		return mv;
	}

}
