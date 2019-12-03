package shop.shoes.model;

public class CategoryMapDTO {

	private int categoryId;
	private int goodsId;
	private String createDate;
	private String updateDate;
	
	public CategoryMapDTO() {}
	
	public CategoryMapDTO(int categoryId, int goodsId, String createDate, String updateDate) {
		super();
		this.categoryId = categoryId;
		this.goodsId = goodsId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
}
