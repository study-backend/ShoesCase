package shop.shoes.common;

import shop.util.JsonUtil;

public class ShopResponse {

	public StatusCode statusCode = StatusCode.Success;
	
	public String resultJson;
	
	
	public ShopResponse() {   } 
	
	public ShopResponse(StatusCode statusCode, String resultJson) {
		super();
		this.statusCode = statusCode;
		this.resultJson = resultJson;
	}

	public StatusCode getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

	public String getResultJson() {
		return resultJson;
	}

	public void setResultJson(String resultJson) {
		this.resultJson = JsonUtil.toJson(resultJson);
	}

}
