package shop.shoes.model;

public class CancelDTO {
	private int cancelId;
	private int purchaseGoodsId;
	private int purchaseBasketId;
	private int price;
	private int stateCode;
	private String reason;
	private String billKey;
	private int goodsId;
	private int itemCount;
	private String itemSn;
	private String createDate;
	private String updateDate;
	
	public CancelDTO() {}

	public CancelDTO(int cancelId, int purchaseGoodsId, int purchaseBasketId, int price, int stateCode, String reason,
			String billKey, int goodsId, int itemCount, String itemSn, String createDate, String updateDate) {
		super();
		this.cancelId = cancelId;
		this.purchaseGoodsId = purchaseGoodsId;
		this.purchaseBasketId = purchaseBasketId;
		this.price = price;
		this.stateCode = stateCode;
		this.reason = reason;
		this.billKey = billKey;
		this.goodsId = goodsId;
		this.itemCount = itemCount;
		this.itemSn = itemSn;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getCancelId() {
		return cancelId;
	}

	public void setCancelId(int cancelId) {
		this.cancelId = cancelId;
	}

	public int getPurchaseGoodsId() {
		return purchaseGoodsId;
	}

	public void setPurchaseGoodsId(int purchaseGoodsId) {
		this.purchaseGoodsId = purchaseGoodsId;
	}

	public int getPurchaseBasketId() {
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

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
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

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
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
