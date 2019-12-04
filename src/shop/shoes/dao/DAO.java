package shop.shoes.dao;

import java.util.List;

public interface DAO<T> {
	/**
	 * 리뷰 테이블 전체 select
	 * 보여줄 속성(테이블의 필드)
	 * 번호(id), 제목, 내용, 작성자, 작성일 순서
	 */
	List<T> selectAll();
	
	/**
	 * 후기 작성
	 * 번호, 작성일, 작성자 자동생성
	 * 제목, 내용만 적어서 작성
	 * 
	 */
	int insert(T reviewDto);
	
	
	/**
	 * 수정
	 * 제목, 내용 수정
	 */
	int update(T reviewDto);
	
	
	/**
	 * 삭제
	 */
	int delete(int id);
	
}