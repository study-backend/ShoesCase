package shop.shoes.model;

import java.sql.Date;

public class GoodsVersionDTO {

	private long versionId;
    private String filePath;
    private Date createDate;
    private Date updateDate;
    
    public GoodsVersionDTO() { }
    
	public GoodsVersionDTO(long versionId, String filePath, Date createDate, Date updateDate) {
		super();
		this.versionId = versionId;
		this.filePath = filePath;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
    public long getVersionId() {
		return versionId;
	}

	public void setVersionId(long versionId) {
		this.versionId = versionId;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
