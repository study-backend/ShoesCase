package shop.shoes.service;

import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.CategoryDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.GoodsVersionDTO;
import shop.shoes.model.dto.GoodsDetailDTO;
import shop.shoes.model.dto.GoodsMainDTO;

public interface GoodsService {


	List<GoodsDTO> selectByCatagory(String categoryName) throws Exception;
	
	

	GoodsDTO selectOneProduct(long goodsId) throws Exception;
	
	/**
	 * 상품 메인화면 출력
	 * @throws Exception 
	 * 
	 * */
	public GoodsMainDTO goodsMain(GoodsVersionDTO version) throws Exception; 
	
	/**
	 * 상품 카테고리별 보기
	 * @throws Exception
	 * */
	public List<GoodsDTO> goodsSub(CategoryDTO category) throws Exception;
	
	/**
	 * 상품상세보기
	 * @throws Exception
	 * */
	public GoodsDetailDTO goodsDetail(GoodsDTO goods) throws Exception;
	
	/**
	 * 상품 입력(벌크입력)
	 * 
	 * */
	public int insertGoodsList() throws Exception;
	
	/**
	 * (보류) 상품수정
	 * */
	public int updateGoods(GoodsDTO goods) throws Exception;
	
	/**
	 * (보류) 상품삭제
	 * */
	public int deleteGoods(GoodsDTO goods) throws Exception;
}
