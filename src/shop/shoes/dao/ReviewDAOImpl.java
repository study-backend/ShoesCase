package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.ReviewDTO;
import shop.shoes.model.dto.GoodsReviewDTO;
import shop.util.DbUtil;

public class ReviewDAOImpl implements ReviewDAO {

	@Override
	public List<ReviewDTO> selectAll() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ReviewDTO> list = new ArrayList<ReviewDTO>();
		String sql = "select * from review";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			
			/*
			 * 
			 * private int reviewId;
	private int goodsId;
	private int accountId;
	private String reviewPwd; // 리뷰 pwd 추가
	private String title;
	private String content;
	private int score; //만족도 (0~5)
	private String createDate; //db의 log용 & 화면에 띄울 작성일
	private String updateDate;
			 */
			while(rs.next()) {
				/**	dto 생성자로 받는 파라미터 8개
				 * 	int reviewId, int goodsId, int accountId,  String title, String content,
					int score, String createDate, String updateDate 
				 */
				list.add(new ReviewDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getString(8),rs.getString(9)));
				
			}
			
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
			
		}
		return list;
	}

	@Override
	public int insert(ReviewDTO reviewDto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		String sql = "insert into review values(seq_id.nextval, 1, 30, ?, ?, ?, ?, sysdate,sysdate)";
		//테스트용insert query라서 
		//goods_Id 1로 test
		//account_Id 를 30으로 주었음
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
	//파라메터 맞춰줘야함	
			ps.setString(1, reviewDto.getReviewPwd());
			ps.setString(2, reviewDto.getTitle());
			ps.setString(3, reviewDto.getContent());
			ps.setInt(4, reviewDto.getScore());
			
			
			
			result = ps.executeUpdate();
			
			
			
		}finally {
			DbUtil.dbClose(ps, con);
			
		}
			
		
		
		return result;
	}

	@Override
	public int update(ReviewDTO reviewDto)throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		
		String sql = "update review set title= ?, content= ?, score = ?, create_date=sysdate "
				+ "where review_id=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, reviewDto.getTitle());
			ps.setString(2, reviewDto.getContent());
			ps.setInt(3, reviewDto.getScore());
			ps.setInt(4,reviewDto.getReviewId());
			
			result = ps.executeUpdate();
			
			
			
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int delete(int reviewId) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		String sql = "delete review where review_id=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, reviewId);
			
			
			result = ps.executeUpdate();
			

			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public List<ReviewDTO> selectByGoodName(String goodsName) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ReviewDTO> list = new ArrayList<ReviewDTO>();
		String sql = "select R1.REVIEW_ID,R1.GOODS_ID,R1.ACCOUNT_ID,R1.TITLE,R1.CONTENT,R1.SCORE,R1.CREATE_DATE,R1.UPDATE_DATE"
				+ " from REVIEW R1 inner join GOODS G1 on R1.GOODS_ID = G1.GOODS_ID WHERE G1.NAME = ?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, goodsName);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				/**	dto 생성자로 받는 파라미터 8개
				 * 	int reviewId, int goodsId, int accountId,  String title, String content,
					int score, String createDate, String updateDate 
				 */
				list.add(new ReviewDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8)));
				
			}
			
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
			
		}
		return list;
	}

	@Override
	public ReviewDTO selectByReviewId(int reviewId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
