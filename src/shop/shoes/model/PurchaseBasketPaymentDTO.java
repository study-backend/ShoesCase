package shop.shoes.model;

import java.sql.Date;

public class PurchaseBasketPaymentDTO {
	private long purchaseBasketId;
	private int paymentType;
	private int price;
	private String recieverName;
	private String recieverPhone;
	private String deliveryComment;
	private Date createDate;
	private Date updateDate;
	
	public PurchaseBasketPaymentDTO() {}

	public PurchaseBasketPaymentDTO(long purchaseBasketId, int paymentType, int price, String recieverName,
			String recieverPhone, String deliveryComment, Date createDate, Date updateDate) {
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

	public long getPurchaseBasketId() {
		return purchaseBasketId;
	}

	public void setPurchaseBasketId(long purchaseBasketId) {
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
