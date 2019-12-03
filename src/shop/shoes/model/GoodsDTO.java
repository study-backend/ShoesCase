package shop.shoes.model;

public class GoodsDTO {

	private long goodsId;
    private double price;
    private String name;
    private int count;
    private String imgPath;
    private String sumnailPath;
    private int colorCode;
    private int sizeCode;
    private String itemSn;
    private long goddsVersion;
    private int saleCode;
    private int saleState;
    private String createDate;
    private String updateDate;
    private int totalPrice;
    
    private CategoryMapDTO categoryMap;
    private CategoryDTO category;
    
    public GoodsDTO() { }
    
    


	public GoodsDTO(double price, String name, String imgPath) {
		super();
		this.price = price;
		this.name = name;
		this.imgPath = imgPath;
	}


	

	public GoodsDTO(double price, String name, int count, String imgPath, String sumnailPath, int colorCode,
			int sizeCode, int totalPrice) {
		super();
		this.price = price;
		this.name = name;
		this.count = count;
		this.imgPath = imgPath;
		this.sumnailPath = sumnailPath;
		this.colorCode = colorCode;
		this.sizeCode = sizeCode;
		this.totalPrice = totalPrice;
	}




	public GoodsDTO(long goodsId, double price, String name, int count, String imgPath, String sumnailPath,
			int colorCode, int sizeCode, String itemSn, long goddsVersion, int saleCode, int saleState,
			String createDate, String updateDate) {
		super();
		this.goodsId = goodsId;
		this.price = price;
		this.name = name;
		this.count = count;
		this.imgPath = imgPath;
		this.sumnailPath = sumnailPath;
		this.colorCode = colorCode;
		this.sizeCode = sizeCode;
		this.itemSn = itemSn;
		this.goddsVersion = goddsVersion;
		this.saleCode = saleCode;
		this.saleState = saleState;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}



	public long getGoodsId() {
		return goodsId;
	}



	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public String getImgPath() {
		return imgPath;
	}



	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}



	public String getSumnailPath() {
		return sumnailPath;
	}



	public void setSumnailPath(String sumnailPath) {
		this.sumnailPath = sumnailPath;
	}



	public int getColorCode() {
		return colorCode;
	}



	public void setColorCode(int colorCode) {
		this.colorCode = colorCode;
	}



	public int getSizeCode() {
		return sizeCode;
	}



	public void setSizeCode(int sizeCode) {
		this.sizeCode = sizeCode;
	}



	public String getItemSn() {
		return itemSn;
	}



	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}



	public long getGoddsVersion() {
		return goddsVersion;
	}



	public void setGoddsVersion(long goddsVersion) {
		this.goddsVersion = goddsVersion;
	}



	public int getSaleCode() {
		return saleCode;
	}



	public void setSaleCode(int saleCode) {
		this.saleCode = saleCode;
	}



	public int getSaleState() {
		return saleState;
	}



	public void setSaleState(int saleState) {
		this.saleState = saleState;
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



	public CategoryMapDTO getCategoryMap() {
		return categoryMap;
	}



	public void setCategoryMap(CategoryMapDTO categoryMap) {
		this.categoryMap = categoryMap;
	}



	public CategoryDTO getCategory() {
		return category;
	}



	public void setCategory(CategoryDTO category) {
		this.category = category;
	}




	public int getTotalPrice() {
		return totalPrice;
	}




	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	} 
    
	
}
