package shop.shoes.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.dao.GoodsDAO;
import shop.shoes.dao.GoodsDAOImpl;
import shop.shoes.model.GoodsDTO;

public class GoodsServiceImpl implements GoodsService {

	@Override
	public List<GoodsDTO> selectByCatagory(String categoryName) throws Exception { 
		//dao에서 얻어온 카테고리 list를 저장해서 컨트롤러로 리턴
		
		List<GoodsDTO> list =new ArrayList<GoodsDTO>();
		GoodsDAO goodsDAO = new GoodsDAOImpl();
				
		list = goodsDAO.selectByCatagory(categoryName);
		
		if(list==null) { //검색된 것 없음 or 카테고리 없음 or 다른이유로 에러
			
		}
		
		return list;
		
	}

	@Override
	public GoodsDTO selectOneProduct(long goodsId) throws SQLException {
		GoodsDTO goodsDTO = new GoodsDTO(); //dao 갔다와서 담을 dto 선언
		GoodsDAO goodsDAO = new GoodsDAOImpl(); // dao 선언
		
		goodsDTO = goodsDAO.selectOneProduct(goodsId);
		if(goodsDTO==null) {
			//dto가 검색 없음 or 다른이유로 에러
		}
		return goodsDTO;
	}

}
