package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.model.GoodsDTO;
import shop.shoes.model.ReviewDTO;
import shop.shoes.model.dto.GoodsDetailDTO;
import shop.shoes.service.GoodsService;
import shop.shoes.service.GoodsServiceImpl;

public class ProductDetailReadController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		String goodsNameOrImg = request.getParameter("goodsNameOrImg");
		//System.out.println(goodsNameOrImg+"나와줘~~~");
		GoodsService service = new GoodsServiceImpl();
		
		
		GoodsDetailDTO goodsDetail = service.goodsDetail(goodsNameOrImg);
		
		//상세페이지 상품 조회
		GoodsDTO goods = goodsDetail.getGoods();
		request.setAttribute("goods", goods);
		
		
		//리뷰 조회
		List<ReviewDTO> reviewList = goodsDetail.getReviews();
		request.setAttribute("reviewList", reviewList);
		
		mv.setViewName("detailPage.jsp");
		
		return mv;
	}

}
