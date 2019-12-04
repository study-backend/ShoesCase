package shop.shoes.model;

public class PurchaseBasket {
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
	private int accountId;
	private int totalPrice;
	private String orderDate;
	private String imgPath;
	private int stateCode;
	private String billKey;
	private String deliveryAddr;
	private String createDate;
	private String updateDate;
	
	public PurchaseBasket() {}

	
	public PurchaseBasket(int totalPrice) {
		super();
		this.totalPrice = totalPrice;
	}


	public PurchaseBasket(int basketId, int accountId, int totalPrice, String orderDate, String imgPath, int stateCode,
			String billKey, String deliveryAddr, String createDate, String updateDate) {
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

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
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
