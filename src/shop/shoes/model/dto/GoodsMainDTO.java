package shop.shoes.model.dto;

import java.util.List;

import shop.shoes.model.CategoryDTO;
import shop.shoes.model.GoodsDTO;

public class GoodsMainDTO {
	

	private List<GoodsDTO> goodsList;
	private List<CategoryDTO> categoryList;
	
	
	public GoodsMainDTO() { }
	
	public GoodsMainDTO(List<GoodsDTO> goodsList, List<CategoryDTO> categoryList) { 
		this.goodsList = goodsList;
		this.categoryList = categoryList;
	}
	
	public List<GoodsDTO> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsDTO> goodsList) {
		this.goodsList = goodsList;
	}

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setReviewList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}
}
