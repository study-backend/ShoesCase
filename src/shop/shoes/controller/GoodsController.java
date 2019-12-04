package shop.shoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.*;
import shop.shoes.service.GoodsService;
import shop.shoes.service.GoodsServiceImpl;

public class GoodsController implements Controller{
	
	// �ʿ��� service�� ���⼭ ����� 
	private static GoodsService goodsService = new GoodsServiceImpl();
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		//String uri = request.getRequestURI();
		//System.out.println(uri);
		
		// json 변환이 필요함
		String data = request.getParameter("data");
		System.out.println(data);
		
		// return 에 대한 부분 필요 
		String result = "";
		
		String httpMethod = request.getMethod();
		switch (httpMethod) {

			case "get": {

				switch(data) {
				
					// 상품 정보 가져오기
					case "goodsMain": {	
						
						goodsService.goodsMain(null);
						break;
					}
					case "goodsSub": {
						goodsService.goodsSub(null);
						break;
					}
					case "goodsDetail": {
						goodsService.goodsDetail(null);
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
		
		
		ModelAndView mv = new ModelAndView("NewFile.html", true, result);
		return mv;
	}

}
