package shop.shoes.common;

public class ShopResponse {

	public StatusCode statusCode = StatusCode.None;
	
	public String message;
	
	public String resultJson;
	
	
	public ShopResponse() {   } 
	
	public ShopResponse(StatusCode statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
	
	public ShopResponse(int result, String message) {
		super();
		this.statusCode = fromInteger(result);
		this.message = message;
	}

	public StatusCode getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getResultJson() {
		return resultJson;
	}

	public void setResultJson(String json) {
		this.resultJson = json;
	}
	
	public StatusCode fromInteger(int x) {
        switch(x) {
        case 0:
            return StatusCode.None;
        case 1:
            return StatusCode.Success;
        }
        return StatusCode.None;
    }

}
