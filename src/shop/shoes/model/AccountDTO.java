package shop.shoes.model;

import java.util.List;

public class AccountDTO {

	private long account;
    private String loginId;
    private String loginPwd;
    private String name;
    private String phone;
    private String email;
    private String addr;
    private char sex;
    private String birthday;
    private String loginDate;
    private String logoutDate;
    private int termsVersion;
    private String termsAgreeDate;
    private String creteDate;
    private String updateDate;
    private String deleteDate;
    
    private List<Review> reviews;
    
    public AccountDTO() { }

	public AccountDTO(long account, String loginId, String loginPwd, String name, String phone, String email, String addr,
			char sex, String birthday, String loginDate, String logoutDate, int termsVersion, String termsAgreeDate,
			String creteDate, String updateDate, String deleteDate, List<Review> reviews) {
		super();
		this.account = account;
		this.loginId = loginId;
		this.loginPwd = loginPwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
		this.sex = sex;
		this.birthday = birthday;
		this.loginDate = loginDate;
		this.logoutDate = logoutDate;
		this.termsVersion = termsVersion;
		this.termsAgreeDate = termsAgreeDate;
		this.creteDate = creteDate;
		this.updateDate = updateDate;
		this.deleteDate = deleteDate;
		this.reviews = reviews;
	}
    
    public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPwd() {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}

	public String getLogoutDate() {
		return logoutDate;
	}

	public void setLogoutDate(String logoutDate) {
		this.logoutDate = logoutDate;
	}

	public int getTermsVersion() {
		return termsVersion;
	}

	public void setTermsVersion(int termsVersion) {
		this.termsVersion = termsVersion;
	}

	public String getTermsAgreeDate() {
		return termsAgreeDate;
	}

	public void setTermsAgreeDate(String termsAgreeDate) {
		this.termsAgreeDate = termsAgreeDate;
	}

	public String getCreteDate() {
		return creteDate;
	}

	public void setCreteDate(String creteDate) {
		this.creteDate = creteDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
