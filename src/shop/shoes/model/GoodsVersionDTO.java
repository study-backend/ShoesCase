package shop.shoes.model;

public class GoodsVersionDTO {

	private long versionId;
    private String filePath;
    private String createDate;
    private String updateDate;
    
    public GoodsVersionDTO() { }
    
	public GoodsVersionDTO(long versionId, String filePath, String createDate, String updateDate) {
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
