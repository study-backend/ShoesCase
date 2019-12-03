package shop.shoes.model;

public class ReviewDTO {

	private long reviewId;
    private String title;
    private String content;
    private int score;
    private String createDate;
    private String updateDate;
    
    // 아래 항목은 id만 넣어야 할 수 있다 
    private long accountId;
    private long goodsId;
    
    public ReviewDTO() {  }
    
	public ReviewDTO(long reviewId, String title, String content, int score, String createDate, String updateDate,
			long accountId, long goodsId) {
		super();
		this.reviewId = reviewId;
		this.title = title;
		this.content = content;
		this.score = score;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.accountId = accountId;
		this.goodsId = goodsId;
	}
	
    public long getReviewId() {
		return reviewId;
	}

	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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

	public long getAccount() {
		return this.accountId;
	}

	public void setAccount(long accountId) {
		this.accountId = accountId;
	}

	public long getGoods() {
		return goodsId;
	}

	public void setGoods(long goodsId) {
		this.goodsId = goodsId;
	}
    
    
}
