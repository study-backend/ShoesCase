package shop.shoes.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.shoes.service.GoodsService;
import shop.shoes.service.GoodsServiceImpl;

public class ProductDetailReadController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		
		GoodsService service = new GoodsServiceImpl();
		
		return null;
	}

}
