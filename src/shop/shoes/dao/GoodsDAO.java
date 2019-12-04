package shop.shoes.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.GoodsDTO;

public interface GoodsDAO {

	/**
	 * 카테고리 클릭 시 해당하는 신발 상품 조회(select)
	 * 보여줄 속성 : 상품이름, 상품사진, 상품가격
	 * */
	List<GoodsDTO> selectByCatagory(String categoryName) throws SQLException;
	
	/**
	 * 상품 사진 클릭시 상세 페이지에서 상품에대한 정보 select
	 * 작은 이미지 사진, 상품이름, 색상, 가격, 사이즈, 수량, 총가격, 큰이미지 사진
	 * */
	GoodsDTO selectOneProduct(long goodsId) throws SQLException;
	
	List<GoodsDTO> selectByCatagoryId(long categoryId) throws SQLException;
	
	List<GoodsDTO> selectByVersionId(long versionId) throws SQLException;
}
