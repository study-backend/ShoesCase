package shop.shoes.model;

import java.sql.Date;

public class BillKeyDTO {

	private String billKey;
	private Date issueDate;
	private Date cancelDate;
	private Date createDate;
	private Date updateDate;
	
	public BillKeyDTO() {}
	public BillKeyDTO(String billKey, Date issueDate, Date cancelDate, Date createDate, Date updateDate) {
		super();
		this.billKey = billKey;
		this.issueDate = issueDate;
		this.cancelDate = cancelDate;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public String getBillKey() {
		return billKey;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
