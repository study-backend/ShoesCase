package shop.shoes.service;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.model.GoodsDTO;

public interface GoodsService {
	
	
	/**
	 * ī�װ��� ���� ��ǰ ������(list) : ��ǰ�̸�, ��ǰ����, ��ǰ����
	 * dao���� select�� ������ ��Ʈ�ѷ��� ����
	 */
	List<GoodsDTO> selectByCatagory(String categoryName) throws Exception;
	
	
	/**
	 * ��ǰ ���� Ŭ���� �� ���������� ��ǰ������ ���� select
	 * ���� �̹��� ����, ��ǰ�̸�, ����, ����, ������, ����, �Ѱ���, ū�̹��� ����
	 * �� ���� �̹Ƿ� dto ��ü �Ѱ���
	 * */
	GoodsDTO selectOneProduct(long goodsId) throws SQLException;
}
