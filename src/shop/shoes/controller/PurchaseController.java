package shop.shoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.core.Logback;
import shop.shoes.common.GlobalException;
import shop.shoes.common.StatusCode;
import shop.shoes.service.PurchaseService;
import shop.shoes.service.PurchaseServiceImpl;

import shop.util.UserSessionUtil;

public class PurchaseController implements Controller {

	private static PurchaseService purchaseService = new  PurchaseServiceImpl();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		boolean isLogin = UserSessionUtil.isLogined(request.getSession());
		if(isLogin == false) {
			throw new GlobalException("로그인되지 않은 사용자입니다", StatusCode.Not_Access_User);
		}

		// json 변환이 필요함
		String route = request.getParameter("route");
		String data = request.getParameter("data");
		String httpMethod = request.getMethod();
		
		Logback.debug(httpMethod + " => route : " + route + " ||  isLogin : " + isLogin);

		ModelAndView mv = new ModelAndView();
		
		switch (httpMethod) {

			case "GET": {
	
				switch (route) {
				//
					case "purchaseAll": {
		
						break;
					}
					case "purchaseByUser": {
		
						break;
					}
					case "purchaseOfSearch": {
		
						break;
					}
				}
	
				break;
			}
			case "POST": {
	
				switch (route) {
	
					// 상품정보 입력
					case "purchase": {
						
							
							
							//int result = purchaseService.insertPurchase(goodsList, basket, payment, account, purchaseGoodsDTO)
						
						
						break;
					}
				}
	
				break;
			}
			case "PATCH": {
	
				switch (route) {
	
					// 상품정보 수정
					case "purchase": {
		
						break;
					}
				}
	
				break;
			}
			case "DELETE": {
	
				switch (route) {
	
					// 상품 삭제
					case "purchase": {
		
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
