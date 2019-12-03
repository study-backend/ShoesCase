package shop.shoes.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.GoodsDTO;

public interface GoodsDAO {

	/**
	 * ī�װ��� Ŭ�� �� �ش��ϴ� �Ź� ��ǰ ��ȸ(select)
	 * ������ �Ӽ� : ��ǰ�̸�, ��ǰ����, ��ǰ����
	 * */
	List<GoodsDTO> selectByCatagory(int categoryId) throws SQLException;
	
	/**
	 * ��ǰ ���� Ŭ���� �� ���������� ��ǰ������ ���� select
	 * ���� �̹��� ����, ��ǰ�̸�, ����, ����, ������, ����, �Ѱ���, ū�̹��� ����
	 * */
	List<GoodsDTO> selectOneProduct(long goodsId) throws SQLException;
	
}