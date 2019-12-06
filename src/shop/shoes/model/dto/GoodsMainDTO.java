package shop.shoes.model.dto;

import java.util.List;

import shop.shoes.model.CategoryDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.RollingBannerDTO;

public class GoodsMainDTO {
	

	public List<RollingBannerDTO> getBannerList() {
		return bannerList;
	}

	public void setBannerList(List<RollingBannerDTO> bannerList) {
		this.bannerList = bannerList;
	}

	private List<GoodsDTO> goodsList;
	private List<CategoryDTO> categoryList;
	private List<RollingBannerDTO> bannerList;
	
	
	public GoodsMainDTO() { }
	
	public GoodsMainDTO(List<GoodsDTO> goodsList, List<CategoryDTO> categoryList, List<RollingBannerDTO> bannerList) { 
		this.goodsList = goodsList;
		this.categoryList = categoryList;
		this.bannerList = bannerList;
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

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}
	
	
}
