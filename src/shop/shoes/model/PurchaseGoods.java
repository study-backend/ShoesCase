package shop.shoes.model;

import java.util.List;

public class PurchaseGoods {
    private long purchaseGoodId;
    private int stateCode;
    private String name;
    private int count;
    private double price;
    private String imagPath;
    private String billKey;
    private long purchaseBasketId;
    private long goodsId;
    private String createDate;
    private String updateDate;
    
    private BillKeyDTO billDto;
    
    private List<PurchaseBasket> PurchaseList;
    
    public PurchaseGoods() {} 
    
	public PurchaseGoods(long purchaseGoodId, int stateCode, String name, int count, double price, String imagPath,
			String billKey, long purchaseBasketId, long goodsId, String createDate, String updateDate) {
		super();
		this.purchaseGoodId = purchaseGoodId;
		this.stateCode = stateCode;
		this.name = name;
		this.count = count;
		this.price = price;
		this.imagPath = imagPath;
		this.billKey = billKey;
		this.purchaseBasketId = purchaseBasketId;
		this.goodsId = goodsId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	
	public BillKeyDTO getBillDto() {
		return billDto;
	}

	public void setBillDto(BillKeyDTO billDto) {
		this.billDto = billDto;
	}

	public List<PurchaseBasket> getPurchaseList() {
		return PurchaseList;
	}

	public void setPurchaseList(List<PurchaseBasket> purchaseList) {
		PurchaseList = purchaseList;
	}

	public long getPurchaseGoodId() {
		return purchaseGoodId;
	}

	public void setPurchaseGoodId(long purchaseGoodId) {
		this.purchaseGoodId = purchaseGoodId;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImagPath() {
		return imagPath;
	}

	public void setImagPath(String imagPath) {
		this.imagPath = imagPath;
	}

	public String getBillKey() {
		return billKey;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public long getPurchaseBasketId() {
		return purchaseBasketId;
	}

	public void setPurchaseBasketId(long purchaseBasketId) {
		this.purchaseBasketId = purchaseBasketId;
	}

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
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
