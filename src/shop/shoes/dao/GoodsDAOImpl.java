package shop.shoes.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.GoodsDTO;
import shop.util.DbUtil;

public class GoodsDAOImpl implements GoodsDAO {

	@Override
	public List<GoodsDTO> selectByCatagory(String categoryName) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDTO goodsDto = null;
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "select PRICE, NAME, IMG_PATH  from GOODS G1 INNER JOIN CATEGORY G2 ON G1.CATEGORY_ID = G2.CATEGORY_ID where G2.NAME=?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, categoryName);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				goodsDto = new GoodsDTO(rs.getDouble(1), rs.getString(2), rs.getString(3)); //생성자 오버로딩 했음
				list.add(goodsDto);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}
	
	@Override
	public List<GoodsDTO> selectByCatagoryId(long categoryId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDTO goodsDto = null;
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "select PRICE, NAME, IMG_PATH  from GOODS G1 INNER JOIN CATEGORY G2 ON G1.CATEGORY_ID = G2.CATEGORY_ID where G2.ID=?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setLong(1, categoryId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				goodsDto = new GoodsDTO(rs.getDouble(1), rs.getString(2), rs.getString(3)); //생성자 오버로딩 했음
				list.add(goodsDto);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

	@Override
	public GoodsDTO selectOneProduct(long goodsId) throws SQLException {
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
								rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8)); //생성자 오버로딩 했음
				list.add(goodsDto);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return goodsDto;
	}

	@Override
	public List<GoodsDTO> selectByVersionId(long versionId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDTO goodsDto = null;
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "SELECT GOODS_ID, PRICE, NAME, COUNT, IMG_PATH, SUMNAIL_PATH, COLOR_CODE, SIZE_CODE, ITEM_SN\r\n" + 
				" , GOODS_VERSION, SALE_CODE, SALE_STATE, CREATE_DATE, UPDATE_DATE \r\n" + 
				" FROM GOODS\r\n" + 
				" WHERE GOODS_VERSION = ?";
		try {
			con = DbUtil.getConnection();
			System.out.println("con : " + con);
			ps= con.prepareStatement(sql);
			ps.setLong(1, versionId);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				goodsDto = new GoodsDTO(rs.getLong(1), rs.getDouble(2), rs.getString(3), rs.getInt(4),
								rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9),
								rs.getLong(10), rs.getInt(11), rs.getInt(12), rs.getDate(13), rs.getDate(14)); //생성자 오버로딩 했음
				
				
				
				list.add(goodsDto);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}


}
