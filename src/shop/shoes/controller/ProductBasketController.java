package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.service.PurchaseService;
import shop.shoes.service.PurchaseServiceImpl;

public class ProductBasketController implements Controller{
	
	private static PurchaseService purchaseService = new PurchaseServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		
		
		//String uri = request.getRequestURI();
		//System.out.println(uri);
		
		// json 변환이 필요함
		String route = request.getParameter("route");
		String data = request.getParameter("data");
		System.out.println(route);
		
		// return 에 대한 부분 필요 
		String result = "";
		
		String httpMethod = request.getMethod();
		switch (httpMethod) {

			case "get": {

				switch(route) {
					
					// 상품 구매
					case "purchase": {	
						
	
						break;
					}
					
				}

				break;
			}
			case "post": {
				
				switch(route) {
				
					// 상품 구매
					case "purchase": {	
						

						break;
					}
					
		
			}
				
				break;
			}
			case "patch" : {
				
				switch(route) {
				
				
					case "purchase": {	

						break;
					}
				}
				
				break;
			}
			case "delete" : {
				
				switch(route) {
				
					// 
					case "purchase": {	

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
