package shop.shoes.model;

import java.sql.Date;

public class CategoryDTO {
	private long categoryId;
	private int sortOrder;
	private String name;
	private Date createDate;
	private Date updateDate;
	
	public CategoryDTO() {}

	public CategoryDTO(long categoryId, int sortOrder, String name, Date createDate, Date updateDate) {
		super();
		this.categoryId = categoryId;
		this.sortOrder = sortOrder;
		this.name = name;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
