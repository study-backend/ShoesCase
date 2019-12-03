package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.GoodsDTO;
import shop.util.DbUtil;

public class GoodsDAOImpl implements GoodsDAO {

	@Override
	public List<GoodsDTO> selectByCatagory(int categoryId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDTO goodsDto = null;
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "select PRICE, NAME, IMG_PATH  from GOODS G1 INNER JOIN CATEGORY_MAP G2 ON "
				+ " G1.GOODS_ID = G2.CATEGORY_ID INNER JOIN CATEGORY G3 ON G2.CATEGORY_ID = G3.CATEGORY_ID where CATEGORY_ID=?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				goodsDto = new GoodsDTO(rs.getDouble(1), rs.getString(2), rs.getString(3)); //������ �����ε� ����
				list.add(goodsDto);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

	@Override
	public List<GoodsDTO> selectOneProduct(long goodsId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDTO goodsDto = null;
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "SELECT PRICE, NAME, COUNT, IMG_PATH, SUMNAIL_PATH, COLOR_CODE, SIZE_CODE, (PRICE*COUNT) AS TOTAL "
				+ " FORM GOODS WHERE GOODS_ID = ?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setLong(1, goodsId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				goodsDto = new GoodsDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
								rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8)); //������ �����ε� ����
				list.add(goodsDto);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

}
