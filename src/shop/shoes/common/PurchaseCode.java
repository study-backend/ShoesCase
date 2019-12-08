package shop.shoes.common;


public enum PurchaseCode {
	None(0)
  , Success(1)
  
  // 결제 관련
  , Payment_Success(10)
  , Delevery_Ing(11)
  , Delevery_Success(12)
  , Purchase_Success(13)
  
  // 환불 관련
  , Cancel_Ing(20)
  , Cancel_Success(21);
  
	
  private int value;
  private PurchaseCode(int value) {
    this.value = value;
  }
  public int getValue() {
    return value;
  }
};
