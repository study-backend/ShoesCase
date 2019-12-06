package shop.shoes.model.dto;

import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.GoodsDTO;
import shop.shoes.model.ReviewDTO;

public class GoodsDetailDTO {


	private GoodsDTO goods = new GoodsDTO();
	private List<ReviewDTO> reviews = new ArrayList<ReviewDTO>();
	
	public GoodsDetailDTO() {}
	public GoodsDetailDTO(GoodsDTO goods, List<ReviewDTO> reviews) {
		super();
		this.goods = goods;
		this.reviews = reviews;
	}
	
//	public GoodsDetailDTO(GoodsDTO goods) {
//		super();
//		this.goods = goods;
//	}
	
	public GoodsDTO getGoods() {
		return goods;
	}
	public void setGoods(GoodsDTO goods) {
		this.goods = goods;
	}
	public List<ReviewDTO> getReviews() {
		return reviews;
	}
	public void setReviews(List<ReviewDTO> reviews) {
		this.reviews = reviews;
	}
	
}
