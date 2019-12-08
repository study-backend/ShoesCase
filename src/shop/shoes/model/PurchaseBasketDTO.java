package shop.shoes.model;

import java.sql.Date;

public class PurchaseBasketDTO {
	/*
	 * 
	PURCHASE_BASKET_ID NUMBER(19) CONSTRAINT id_purchase_basket_pk PRIMARY KEY,
    ACCOUNT_ID NUMBER(19) NOT NULL,
    TOTAL_PRICE NUMBER NOT NULL,
    ORDER_DATE DATE NOT NULL,
    IMG_PATH VARCHAR(50) NOT NULL,
    STATE_CODE INT NOT NULL,
    BILL_KEY VARCHAR2(100) CONSTRAINT id_PBBill_uk UNIQUE NOT NULL,
    DELEVERY_ADDR VARCHAR2(50)  NOT NULL,
    CREATE_DATE DATE  NOT NULL,
    UPDATE_DATE DATE  NOT NULL
	 * */
	private int basketId;
	private long accountId;
	private int totalPrice;
	private Date orderDate;
	private String imgPath;
	private int stateCode;
	private String billKey;
	private String deliveryAddr;
	private Date createDate;
	private Date updateDate;
	
	public PurchaseBasketDTO() {}

	
	public PurchaseBasketDTO(int totalPrice) {
		super();
		this.totalPrice = totalPrice;
	}


	public PurchaseBasketDTO(int basketId, long accountId, int totalPrice, Date orderDate, String imgPath, int stateCode,
			String billKey, String deliveryAddr, Date createDate, Date updateDate) {
		super();
		this.basketId = basketId;
		this.accountId = accountId;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.imgPath = imgPath;
		this.stateCode = stateCode;
		this.billKey = billKey;
		this.deliveryAddr = deliveryAddr;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public String getBillKey() {
		return billKey;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getDeliveryAddr() {
		return deliveryAddr;
	}

	public void setDeliveryAddr(String deliveryAddr) {
		this.deliveryAddr = deliveryAddr;
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
