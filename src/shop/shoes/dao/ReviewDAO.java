package shop.shoes.dao;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.dto.GoodsReviewDTO;

public interface ReviewDAO {
	/**
	 * ���� ���̺� ��ü select
	 * ������ �Ӽ�(���̺��� �ʵ�)
	 * ��ȣ(id), ����, ����, �ۼ���, �ۼ��� ����
	 */
	List<GoodsReviewDTO> selectAll() throws SQLException;
	
	/**
	 * �ı� �ۼ�
	 * ��ȣ, �ۼ���, �ۼ��� �ڵ�����
	 * ����, ���븸 ��� �ۼ�
	 * 
	 */
	int insert(GoodsReviewDTO reviewDto) throws SQLException;
	
	
	/**
	 * ����
	 * ����, ���� ����
	 */
	int update(GoodsReviewDTO reviewDto) throws SQLException;
	
	
	/**
	 * ����
	 */
	int delete(int reviewId) throws SQLException;
	
}
