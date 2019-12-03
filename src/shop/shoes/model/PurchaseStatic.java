package shop.shoes.model;

public class PurchaseStatic {
	private String saleDate;
	private int goodsId;
	private int paymentType;
	private int saleCount;
	private int salePrice;
	
	public PurchaseStatic() {}
	
	public PurchaseStatic(String saleDate, int goodsId, int paymentType, int saleCount, int salePrice) {
		super();
		this.saleDate = saleDate;
		this.goodsId = goodsId;
		this.paymentType = paymentType;
		this.saleCount = saleCount;
		this.salePrice = salePrice;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public int getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	
	
}
