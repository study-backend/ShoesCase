package shop.shoes.model;

public class ManagerDTO {

	private int idx;
	private String managerId;
	private String managerPwd;
	private String name;
	private String createDate;
    private String updateDate;
    
    public ManagerDTO() {}
	public ManagerDTO(int idx, String managerId, String managerPwd, String name, String createDate, String updateDate) {
		super();
		this.idx = idx;
		this.managerId = managerId;
		this.managerPwd = managerPwd;
		this.name = name;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerPwd() {
		return managerPwd;
	}
	public void setManagerPwd(String managerPwd) {
		this.managerPwd = managerPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
