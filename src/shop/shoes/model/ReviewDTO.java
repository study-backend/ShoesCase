package shop.shoes.model;

public class ReviewDTO {

	private long reviewId;
    private String title;
    private String content;
    private int score;
    private String createDate;
    private String updateDate;
    
    private AccountDTO account;
    private GoodsDTO goods;
    
    public ReviewDTO() {  }
    
	public ReviewDTO(long reviewId, String title, String content, int score, String createDate, String updateDate,
			AccountDTO account, GoodsDTO goods) {
		super();
		this.reviewId = reviewId;
		this.title = title;
		this.content = content;
		this.score = score;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.account = account;
		this.goods = goods;
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

	public AccountDTO getAccount() {
		return account;
	}

	public void setAccount(AccountDTO account) {
		this.account = account;
	}

	public GoodsDTO getGoods() {
		return goods;
	}

	public void setGoods(GoodsDTO goods) {
		this.goods = goods;
	}
    
    
}
