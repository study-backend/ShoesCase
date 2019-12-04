package shop.shoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.*;
import shop.shoes.service.GoodsService;
import shop.shoes.service.GoodsServiceImpl;

public class GoodsController implements Controller{
	
<<<<<<< HEAD
	// 필요한 service를 여기서 만든다 
	private static AccountService accountService = new AccountServiceImpl();
=======
	// �ʿ��� service�� ���⼭ ����� 
	private static GoodsService goodsService = new GoodsServiceImpl();
>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
	
	
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
				
<<<<<<< HEAD
					// 로그인
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.signin(account);
=======
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
>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
						break;
					}
				}

				break;
			}
			case "post": {
				
				switch(data) {
				
<<<<<<< HEAD
					// 회원 가입
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.signUp(account);
=======
					// 상품정보 입력
					case "goods": {	
						
						goodsService.insertGoodsList();
>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
						break;
					}
			}
				
				break;
			}
			case "patch" : {
				
				switch(data) {
				
<<<<<<< HEAD
					// 회원정보 수정
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.updateUserInfo(account);
=======
					// 
					case "goods": {	
						
>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
						break;
					}
				}
				
				break;
			}
			case "delete" : {
				
				switch(data) {
				
<<<<<<< HEAD
					// 회원정보 삭제
					case "account": {	
						AccountDTO account = new AccountDTO();
						accountService.deleteUserInfo(account);
=======
					// 상품 삭제
					case "goods": {	
						
>>>>>>> branch 'master' of https://github.com/study-backend/ShoesCase.git
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
