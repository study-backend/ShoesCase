package shop.shoes.service;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.dao.ReviewDAO;
import shop.shoes.dao.ReviewDAOImpl;
import shop.shoes.model.ReviewDTO;

public class ReviewService {
	//아래 메소드들이 모두 사용햘 ReviewDAO static으로 생성
	private static ReviewDAO reviewDAO = new ReviewDAOImpl();
		
		/**
		 * 상품별 리뷰 검색
		 * sql 예외는 던짐
		 * reviewdao를 사용하기 위해 sevice 메소드는 모두 static
		 */
		public static List<ReviewDTO> selectAll() throws SQLException {
			List<ReviewDTO> list = reviewDAO.selectAll();
			
			return list;
		}
		
		/**
		 * 리뷰 등록
		 * sql 예외 던짐
		 */
		public static int insert(ReviewDTO reviewDTO) throws SQLException{
			int result = reviewDAO.insert(reviewDTO);
			if(result <1) throw new SQLException("등록 실패");
			
			return result;
		}
		
		/**
		 * 글번호에 해당하는 리뷰 삭제 (비번 필요)
		 * 글번호는 db테이블에 review_id로 저장(pk)
		 */
		public static int delete(int reviewId, String reviewPwd) throws SQLException{
			ReviewDTO dbReviewDTO = reviewDAO.selectByReviewId(reviewId);
			if(!dbReviewDTO.getReviewPwd().equals(reviewPwd)) {
				throw new SQLException("비번오류!!");
				
			}
			int result = reviewDAO.delete(reviewId);
			if(result ==0) throw new SQLException("삭제 실패");
			
			return result;
		}
		
		/**
		 * 글번호에 해당하는 리뷰 수정 (비번 필요)
		 * 글번호는 db테이블에 review_id로 저장(pk)
		 */
		public static int update(int reviewId, String reviewPwd) throws SQLException{
			ReviewDTO dbReviewDTO = reviewDAO.selectByReviewId(reviewId);
			if(!dbReviewDTO.getReviewPwd().equals(reviewPwd)) {
				throw new SQLException("비번오류!!");
				
			}
			int result = reviewDAO.update(dbReviewDTO);
			if(result ==0) throw new SQLException("수정 실패");
			
			return result;
		}
		
}