package shop.shoes.model;

public class PurchaseBasketPaymentDTO {
	private int purchaseBasketId;
	private int paymentType;
	private int price;
	private String recieverName;
	private String recieverPhone;
	private String deliveryComment;
	private String createDate;
	private String updateDate;
	
	public PurchaseBasketPaymentDTO() {}

	public PurchaseBasketPaymentDTO(int purchaseBasketId, int paymentType, int price, String recieverName,
			String recieverPhone, String deliveryComment, String createDate, String updateDate) {
		super();
		this.purchaseBasketId = purchaseBasketId;
		this.paymentType = paymentType;
		this.price = price;
		this.recieverName = recieverName;
		this.recieverPhone = recieverPhone;
		this.deliveryComment = deliveryComment;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getPurchaseBasketId() {
		return purchaseBasketId;
	}

	public void setPurchaseBasketId(int purchaseBasketId) {
		this.purchaseBasketId = purchaseBasketId;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRecieverName() {
		return recieverName;
	}

	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}

	public String getRecieverPhone() {
		return recieverPhone;
	}

	public void setRecieverPhone(String recieverPhone) {
		this.recieverPhone = recieverPhone;
	}

	public String getDeliveryComment() {
		return deliveryComment;
	}

	public void setDeliveryComment(String deliveryComment) {
		this.deliveryComment = deliveryComment;
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
