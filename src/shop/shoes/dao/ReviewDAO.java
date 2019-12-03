package shop.shoes.dao;

import java.util.List;

import shop.shoes.model.dto.GoodsReviewDTO;

public interface ReviewDAO {
	/**
	 * ���� ���̺� ��ü select
	 * ������ �Ӽ�(���̺��� �ʵ�)
	 * ��ȣ(id), ����, ����, �ۼ���, �ۼ��� ����
	 */
	List<GoodsReviewDTO> selectAll();
	
	/**
	 * �ı� �ۼ�
	 * ��ȣ, �ۼ���, �ۼ��� �ڵ�����
	 * ����, ���븸 ��� �ۼ�
	 * 
	 */
	int insert(GoodsReviewDTO reviewDto);
	
	
	/**
	 * ����
	 * ����, ���� ����
	 */
	int update(GoodsReviewDTO reviewDto);
	
	
	/**
	 * ����
	 */
	int delete(int reviewId);
	
}
