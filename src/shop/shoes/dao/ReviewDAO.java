package shop.shoes.dao;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.ReviewDTO;

public interface ReviewDAO {
	/**
	 * 리뷰 테이블 전체 select
	 * 보여줄 속성(테이블의 필드)
	 * 번호(id), 제목, 내용, 작성자, 작성일 순서
	 */
	List<ReviewDTO> selectAll() throws SQLException;
	
	/**
	 * 후기 작성
	 * 번호, 작성일, 작성자 자동생성
	 * 제목, 내용만 적어서 작성
	 * 
	 */
	int insert(ReviewDTO reviewDto) throws SQLException;
	
	
	/**
	 * 수정
	 * 제목, 내용 수정
	 */
	int update(ReviewDTO reviewDto) throws SQLException;
	
	
	/**
	 * 삭제
	 */
	int delete(int reviewId) throws SQLException;
	
	/**
	 * reviewId를 통한 reviewDTO 하나 검색(수정 삭제를 위해)
	 * 
	 */
	ReviewDTO selectByReviewId(int reviewId) throws SQLException;
	
}
