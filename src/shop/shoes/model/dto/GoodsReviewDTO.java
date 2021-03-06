package shop.shoes.model.dto;

public class GoodsReviewDTO {
	/**      
	REVIEW_ID INT PRIMARY KEY,
    GOODS_ID INT,
    ACCOUNT_ID INT,
    REGDATE DATE,
    TITLE VARCHAR2(20),
    CONTENT VARCHAR2(200),
    SCORE INT,
    CREATE_DATE DATE,
    UPDATE_DATE DATE
	 */
	private int reviewId;
	private int goodsId;
	private int accountId;
	private String title;
	private String content;
	private int score; //만족도 (0~5)
	private String createDate; //db의 log용 & 화면에 띄울 작성일
	private String updateDate; //db의 log용
	
	public GoodsReviewDTO() {}

	public GoodsReviewDTO(int reviewId, int goodsId, int accountId,  String title, String content,
			int score, String createDate, String updateDate) {
		super();
		this.reviewId = reviewId;
		this.goodsId = goodsId;
		this.accountId = accountId;
		this.title = title;
		this.content = content;
		this.score = score;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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
	
}
