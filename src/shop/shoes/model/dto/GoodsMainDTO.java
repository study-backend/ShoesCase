package shop.shoes.model.dto;

import shop.shoes.model.CategoryDTO;
import shop.shoes.model.GoodsDTO;

public class GoodsMainDTO {
	

	private GoodsDTO goodsList;
	private CategoryDTO categoryList;
	
	
	GoodsMainDTO() { }
	
	GoodsMainDTO(GoodsDTO goodsList, CategoryDTO categoryList) { 
		this.goodsList = goodsList;
		this.categoryList = categoryList;
	}
	
	public GoodsDTO getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(GoodsDTO goodsList) {
		this.goodsList = goodsList;
	}

	public CategoryDTO getReviewList() {
		return categoryList;
	}

	public void setReviewList(CategoryDTO categoryList) {
		this.categoryList = categoryList;
	}
}
