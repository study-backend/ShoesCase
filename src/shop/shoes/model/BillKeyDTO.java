package shop.shoes.model;

public class BillKeyDTO {

	private String billKey;
	private String issueDate;
	private String cancelDate;
	private String createDate;
	private String updateDate;
	
	public BillKeyDTO() {}
	public BillKeyDTO(String billKey, String issueDate, String cancelDate, String createDate, String updateDate) {
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

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
}
