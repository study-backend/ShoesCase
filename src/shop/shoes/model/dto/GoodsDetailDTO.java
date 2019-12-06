package shop.shoes.model.dto;

import java.util.List;

import shop.shoes.model.GoodsDTO;
import shop.shoes.model.ReviewDTO;

public class GoodsDetailDTO {


	private GoodsDTO goods;
	private List<ReviewDTO> reviews;
	
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
