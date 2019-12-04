package shop.shoes.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.dao.GoodsDAO;
import shop.shoes.dao.GoodsDAOImpl;
import shop.shoes.model.GoodsDTO;

public class GoodsServiceImpl implements GoodsService {

	@Override
	public List<GoodsDTO> selectByCatagory(String categoryName) throws Exception { 
		//dao���� ���� ī�װ� list�� �����ؼ� ��Ʈ�ѷ��� ����
		
		List<GoodsDTO> list =new ArrayList<GoodsDTO>();
		GoodsDAO goodsDAO = new GoodsDAOImpl();
				
		list = goodsDAO.selectByCatagory(categoryName);
		
		if(list==null) { //�˻��� �� ���� or ī�װ� ���� or �ٸ������� ����
			
		}
		
		return list;
		
	}

	@Override
	public GoodsDTO selectOneProduct(long goodsId) throws SQLException {
		GoodsDTO goodsDTO = new GoodsDTO(); //dao ���ٿͼ� ���� dto ����
		GoodsDAO goodsDAO = new GoodsDAOImpl(); // dao ����
		
		goodsDTO = goodsDAO.selectOneProduct(goodsId);
		if(goodsDTO==null) {
			//dto�� �˻� ���� or �ٸ������� ����
		}
		return goodsDTO;
	}

}
