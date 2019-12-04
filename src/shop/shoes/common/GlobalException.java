package shop.shoes.common;

public class GlobalException extends Exception {

	private String message;
	private StatusCode resultCode;

	public GlobalException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public GlobalException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public GlobalException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	/////////////////////////////////////////////////
	
	public GlobalException(String message, StatusCode resultCode) {
		super(message);
		this.message = message;
		this.resultCode = resultCode;	
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StatusCode getResultCode() {
		return resultCode;
	}

	public void setResultCode(StatusCode resultCode) {
		this.resultCode = resultCode;
	}
	
}
