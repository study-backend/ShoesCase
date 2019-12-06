package shop.shoes.model;

public class ReviewDTO {
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
	// 리뷰 제목, 리뷰 평점, 리뷰 내용
	private int reviewId;
	private int goodsId;
	private int accountId;
	private String reviewPwd; // 리뷰 pwd 추가
	private String title;
	private String content;
	private int score; //만족도 (0~5)
	private String createDate; //db의 log용 & 화면에 띄울 작성일
	private String updateDate; //db의 log용
	private String loginId;
	
	private AccountDTO account = new AccountDTO(); //ReviewDao에서 리뷰 뿌려지는 부분에서 로그인 아이디가 필요해서 가져옴
	
	
	public ReviewDTO() {}
	public ReviewDTO(String reviewPwd, String title, int score, String content) {}
	
	
	
	public String getReviewPwd() {
		return reviewPwd;
	}

	public void setReviewPwd(String reviewPwd) {
		this.reviewPwd = reviewPwd;
	}

	public AccountDTO getAccount() {
		return account;
	}
	public void setAccount(AccountDTO account) {
		this.account = account;
	}
	
	public ReviewDTO(String loginId, int goodsId, String title, String content, int score, String createDate,
			String updateDate) {
		super();
		this.loginId = loginId;
		this.goodsId = goodsId;
		this.title = title;
		this.content = content;
		this.score = score;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public ReviewDTO( int goodsId, String title, String content, int score, String createDate,
			String updateDate) {
		super();
		this.goodsId = goodsId;
		this.title = title;
		this.content = content;
		this.score = score;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	
	
	
	
//	public ReviewDTO(AccountDTO account, int goodsId, String title, String content, int score, String createDate, String updateDate) {
//		super();
//		this.goodsId = goodsId;
//		this.title = title;
//		this.content = content;
//		this.score = score;
//		this.createDate = createDate;
//		this.updateDate = updateDate;
//		this.account = account;
//	}
	
	public ReviewDTO(int reviewId, int goodsId, int accountId, String reviewPwd, String title, String content,
			int score, String createDate, String updateDate, AccountDTO account) {
		super();
		this.reviewId = reviewId;
		this.goodsId = goodsId;
		this.accountId = accountId;
		this.reviewPwd = reviewPwd;
		this.title = title;
		this.content = content;
		this.score = score;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.account = account;
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

	@Override
	public String toString() {
		return "ReviewDTO [reviewId=" + reviewId + ", goodsId=" + goodsId + ", accountId=" + accountId + ", reviewPwd="
				+ reviewPwd + ", title=" + title + ", content=" + content + ", score=" + score + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}
	
	
}
