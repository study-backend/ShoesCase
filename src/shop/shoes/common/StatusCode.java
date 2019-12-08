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
  , Not_Access_User(10006)
  
  // Goods 관련
  , Not_Found_GoodsId(20001)
  
  // Purchase 관련
  , Not_Found_PurchaseId(30001)
  , Fail_Add_PurchseBasket(30002)
  , Fail_Add_PurchasePayment(30003)
  , Fail_Add_PurchaseGoods(30004)
  , Fail_Issue_BillKey(30005);
	
  private int value;
  private StatusCode(int value) {
    this.value = value;
  }
  public int getValue() {
    return value;
  }
};