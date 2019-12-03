package shop.shoes.model;

public class CategoryDTO {
	private int categoryId;
	private int sortOrder;
	private String name;
	private String createDate;
	private String updateDate;
	
	public CategoryDTO() {}

	public CategoryDTO(int categoryId, int sortOrder, String name, String createDate, String updateDate) {
		super();
		this.categoryId = categoryId;
		this.sortOrder = sortOrder;
		this.name = name;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
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
