package shop.shoes.model;

public class CancelDTO {
	private long cancelId;
	private long purchaseGoodsId;
	private long purchaseBasketId;
	private int price;
	private String reason;
	private int count;
	private String createDate;
	private String updateDate;
	private long goodsId;
	private String billKey;
	private int refundType;
	private String itemSn;

	
	public CancelDTO() {}

	public CancelDTO(long cancelId, long purchaseGoodsId, long purchaseBasketId, int price, String reason,
			String billKey, long goodsId, int count, int refundType, String itemSn, String createDate, String updateDate) {
		super();
		this.cancelId = cancelId;
		this.purchaseGoodsId = purchaseGoodsId;
		this.purchaseBasketId = purchaseBasketId;
		this.price = price;
		this.reason = reason;
		this.billKey = billKey;
		this.goodsId = goodsId;
		this.count = count;
		this.itemSn = itemSn;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.refundType = refundType;
	}

	public long getCancelId() {
		return cancelId;
	}

	public void setCancelId(long cancelId) {
		this.cancelId = cancelId;
	}

	public long getPurchaseGoodsId() {
		return purchaseGoodsId;
	}

	public void setPurchaseGoodsId(long purchaseGoodsId) {
		this.purchaseGoodsId = purchaseGoodsId;
	}

	public long getPurchaseBasketId() {
		return purchaseBasketId;
	}

	public void setPurchaseBasketId(int purchaseBasketId) {
		this.purchaseBasketId = purchaseBasketId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRefundType() {
		return refundType;
	}

	public void setRefundType(int refundType) {
		this.refundType = refundType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getBillKey() {
		return billKey;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
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
