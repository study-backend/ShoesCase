package shop.shoes.model.request;

public class LoginRequest {

	private String loginId;
	private String loginPwd;
	private String name;
	private String email;
	
	
	
	public String getLoginId() {
		System.out.println("req에서 id : " + loginId);
		return loginId;
	}
	public void setLoginId(String loginId) {
		
		this.loginId = loginId;
	}
	public String getLoginPwd() {
		System.out.println("req에서 pwd : " + loginPwd);
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
