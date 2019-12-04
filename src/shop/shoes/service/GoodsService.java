package shop.shoes.service;

import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.CategoryDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.GoodsVersionDTO;
import shop.shoes.model.dto.GoodsDetailDTO;
import shop.shoes.model.dto.GoodsMainDTO;

public interface GoodsService {

	/**
	 * ī�װ����� ���� ��ǰ ������(list) : ��ǰ�̸�, ��ǰ����, ��ǰ����
	 * dao���� select�� ������ ��Ʈ�ѷ��� ����
	 */
	List<GoodsDTO> selectByCatagory(String categoryName) throws Exception;
	
	
	/**
	 * ��ǰ ���� Ŭ���� �� ���������� ��ǰ������ ���� select
	 * ���� �̹��� ����, ��ǰ�̸�, ����, ����, ������, ����, �Ѱ���, ū�̹��� ����
	 * �� ���� �̹Ƿ� dto ��ü �Ѱ���
	 * */
	GoodsDTO selectOneProduct(long goodsId) throws Exception;
	
	/**
	 * ���������� ��ǰ���� ��������
	 * @throws Exception 
	 * 
	 * */
	public GoodsMainDTO goodsMain(GoodsVersionDTO version) throws Exception; 
	
	/**
	 * ī�װ��� �� ȭ�� ��ǰ���� �������� 
	 * @throws Exception
	 * */
	public List<GoodsDTO> goodsSub(CategoryDTO category) throws Exception;
	
	/**
	 * �������� ����
	 * @throws Exception
	 * */
	public GoodsDetailDTO goodsDetail(GoodsDTO goods) throws Exception;
	
	/**
	 * ��ǰ ���� �߰�
	 * 
	 * */
	public int insertGoodsList() throws Exception;
	
	/**
	 * ��ǰ ���� ����
	 * */
	public int updateGoods(GoodsDTO goods) throws Exception;
	
	/**
	 * ��ǰ ���� ����
	 * */
	public int deleteGoods(GoodsDTO goods) throws Exception;
}
