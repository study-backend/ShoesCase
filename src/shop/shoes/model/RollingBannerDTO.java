package shop.shoes.model;

import java.sql.Date;

public class RollingBannerDTO {
	
	public long getRolling_id() {
		return rolling_id;
	}
	public void setRolling_id(long rolling_id) {
		this.rolling_id = rolling_id;
	}
	public long getVersion_id() {
		return version_id;
	}
	public void setVersion_id(long version_id) {
		this.version_id = version_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
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
	
	private long rolling_id;  
	private long version_id; 		
	private String name;
	private String img_path;
	private Date createDate;
    private Date updateDate;
    
	public RollingBannerDTO(long rolling_id, long version_id, String name, String img_path, Date createDate,
			Date updateDate) {
		super();
		this.rolling_id = rolling_id;
		this.version_id = version_id;
		this.name = name;
		this.img_path = img_path;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
    
    
}
