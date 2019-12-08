package shop.shoes.model;

import java.sql.Date;
import java.util.List;

public class PurchaseGoodsDTO {
    private long purchaseGoodId;
    private int stateCode;
    private String name;
    private int count;
    private double price;
    private String imagPath;
    private String billKey;
    private long purchaseBasketId;
    private long goodsId;
    private Date createDate;
    private Date updateDate;
    private long accountId;
    
    //B1.BILL_KEY, P1.NAME,P1.PRICE,P1.COUNT, P1.STATE_CODE
    
    private BillKeyDTO billDto;
    
    private PurchaseBasketDTO purchaseBasket;
    
    public PurchaseGoodsDTO() {} 
    
    
	public PurchaseGoodsDTO(String name, double price, String imagPath) {
		super();
		this.name = name;
		this.price = price;
		this.imagPath = imagPath;
	}


	public PurchaseGoodsDTO(String billKey, String name, double price, int count, int stateCode) {
		super();
		this.stateCode = stateCode;
		this.name = name;
		this.count = count;
		this.price = price;
		this.billKey = billKey;
	}


	public PurchaseGoodsDTO(int stateCode, String name, int count, double price, String imagPath,
			String billKey, long purchaseBasketId, long goodsId, Date createDate, Date updateDate, long accountId) {
		super();
		//this.purchaseGoodId = purchaseGoodId;
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
		this.accountId = accountId;
	}

	
	public BillKeyDTO getBillDto() {
		return billDto;
	}

	public void setBillDto(BillKeyDTO billDto) {
		this.billDto = billDto;
	}

	public PurchaseBasketDTO getPurchaseBasket() {
		return this.purchaseBasket;
	}

	public void setPurchaseBasket(PurchaseBasketDTO purchaseBakset) {
		this.purchaseBasket = purchaseBakset;
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


	public long getAccountId() {
		return accountId;
	}


	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
    
}
