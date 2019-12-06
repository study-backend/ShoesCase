package shop.shoes.common;


public enum StatusCode {
	None(0)
  , Success(1)
  
  // Account 관련
  , Not_Found_Id(10001)
  , Not_Matched_Password(10002)
  , Fail_Add_Account(10003)
  , Fail_Find_ID(10004)
  , Fail_Find_Password(10005)
  
  // Goods 관련
  , Not_Found_GoodsId(20001)
  
  // Purchase 관련
  , Not_Found_PurchaseId(30001);
	
  private int value;
  private StatusCode(int value) {
    this.value = value;
  }
  public int getValue() {
    return value;
  }
};