package shop.shoes.model;

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
    
    private PurchaseGoods() {  } 
    
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
    
    
}
