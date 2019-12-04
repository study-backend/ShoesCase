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
	public int insert(ReviewDTO reviewDto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		String sql = "insert into review values(?,?,?,?,?,?,sysdate,sysdate)";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, reviewDto.getReviewId());
			ps.setInt(2, reviewDto.getGoodsId());
			ps.setInt(3, reviewDto.getAccountId());
			ps.setString(4, reviewDto.getTitle());
			ps.setString(5, reviewDto.getContent());
			ps.setInt(6, reviewDto.getScore());
			
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
	public List<ReviewDTO> selectByGoodId(long goodsId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ReviewDTO> list = new ArrayList<ReviewDTO>();
		String sql = "select * from review WHERE goodsId = ?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setLong(1, goodsId);
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
