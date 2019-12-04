package shop.shoes.model;

import java.sql.Date;
import java.sql.Timestamp;

public class AccountDTO {

    private long accountId;
    private String loginId;
    private String loginPwd;
    private String name;
    private String phone;
    private String email;
    private String addr;
    private char sex;
    private Date birthday;
    //private Date loginDate;
    //private Date logoutDate;
    private int termsVersion;   
    private Date termsAgreeDate;   
    private Date createDate;
    private Date updateDate;
    private Date deleteDate;
    
    public AccountDTO() { }

   

  

	public AccountDTO(String loginId, String loginPwd, String name, String phone, String email, String addr, char sex,
			Date birthday, int termsVersion) {
		super();
		this.loginId = loginId;
		this.loginPwd = loginPwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
		this.sex = sex;
		this.birthday = birthday;
		this.termsVersion = termsVersion;
	}





	public AccountDTO(String name, String phone, String email, String addr) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
	}

	public AccountDTO(long accountId, String loginId, String loginPwd, String name, String phone, String email,
         String addr, char sex, Date birthday, int termsVersion, Date termsAgreeDate, Date createDate,
         Date updateDate, Date deleteDate) {
      super();
      this.accountId = accountId;
      this.loginId = loginId;
      this.loginPwd = loginPwd;
      this.name = name;
      this.phone = phone;
      this.email = email;
      this.addr = addr;
      this.sex = sex;
      this.birthday = birthday;
      this.termsVersion = termsVersion;
      this.termsAgreeDate = termsAgreeDate;
      this.createDate = createDate;
      this.updateDate = updateDate;
      this.deleteDate = deleteDate;
   }
    


   public AccountDTO(String loginId, String loginPwd, String name, String phone, String email, String addr, char sex,
         Date birthday) {
      super();
      this.loginId = loginId;
      this.loginPwd = loginPwd;
      this.name = name;
      this.phone = phone;
      this.email = email;
      this.addr = addr;
      this.sex = sex;
      this.birthday = birthday;
   }



   public long getAccountId() {
      return accountId;
   }

   public void setAccountId(long accountId) {
      this.accountId = accountId;
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

   public Date getBirthday() {
      return birthday;
   }

   public void setBirthday(Date birthday) {
      this.birthday = birthday;
   }

   /*
    * public Date getLoginDate() { return loginDate; }
    * 
    * public void setLoginDate(Date loginDate) { this.loginDate = loginDate; }
    * 
    * public Date getLogoutDate() { return logoutDate; }
    * 
    * public void setLogoutDate(Date logoutDate) { this.logoutDate = logoutDate; }
    */

   public int getTermsVersion() {
      return termsVersion;
   }

   public void setTermsVersion(int termsVersion) {
      this.termsVersion = termsVersion;
   }

   public Date getTermsAgreeDate() {
      return termsAgreeDate;
   }

   public void setTermsAgreeDate(Date termsAgreeDate) {
      this.termsAgreeDate = termsAgreeDate;
   }

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreteDate(Date createDate) {
      this.createDate = createDate;
   }

   public Date getUpdateDate() {
      return updateDate;
   }

   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   public Date getDeleteDate() {
      return deleteDate;
   }

   public void setDeleteDate(Date deleteDate) {
      this.deleteDate = deleteDate;
   }
}
