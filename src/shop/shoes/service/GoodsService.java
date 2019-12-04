package shop.shoes.service;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.GoodsDTO;

public interface GoodsService {
	
	
	/**
	 * 카테고리에 대한 상품 정보들(list) : 상품이름, 상품사진, 상품가격
	 * dao에서 select된 데이터 컨트롤러로 전송
	 */
	List<GoodsDTO> selectByCatagory(String categoryName) throws Exception;
	
	
	/**
	 * 상품 사진 클릭시 상세 페이지에서 상품에대한 정보 select
	 * 작은 이미지 사진, 상품이름, 색상, 가격, 사이즈, 수량, 총가격, 큰이미지 사진
	 * 상세 정보 이므로 dto 객체 한개임
	 * */
	GoodsDTO selectOneProduct(long goodsId) throws SQLException;
}
