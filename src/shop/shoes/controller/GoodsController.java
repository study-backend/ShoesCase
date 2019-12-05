package shop.shoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.*;
import shop.shoes.service.AccountService;
import shop.shoes.service.GoodsService;
import shop.shoes.service.GoodsServiceImpl;
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
		String data = request.getParameter("data");
		System.out.println("data:" + data);
		System.out.println("user :" + user);
		
		
		String httpMethod = request.getMethod();
		switch (httpMethod) {

			case "get": {

				switch(data) {
					// 상품 정보 가져오기
					case "goodsMain": {	
						
						goodsService.goodsMain();
						break;
					}
					case "goodsSub": {
						goodsService.goodsSub(1);
						break;
					}
					case "goodsDetail": {
						goodsService.goodsDetail(null);

						goodsService.goodsDetail(1);
						break;
					}
				}

				break;
			}
			case "post": {
				
				switch(data) {
				
					
					// 상품정보 입력
					case "goods": {	
						
						goodsService.insertGoodsList();
						break;
					}
			}
				
				break;
			}
			case "patch" : {
				
				switch(data) {
				
					
					// 
					case "goods": {	
						
						break;
					}
				}
				
				break;
			}
			case "delete" : {
				
				switch(data) {
				
					
					// 상품 삭제
					case "goods": {	
						
						break;
					}
				}
				
				break;
			}
		}
		
		// result를 json으로 만들어 줘야 함 
		
		
		ModelAndView mv = new ModelAndView("NewFile.html", true);
		return mv;
	}

}
