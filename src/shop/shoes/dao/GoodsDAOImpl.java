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
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "select G1.PRICE, G1.NAME, G1.SUMNAIL_PATH  from GOODS G1 INNER JOIN CATEGORY G2 ON G1.CATEGORY_ID = G2.CATEGORY_ID where G2.NAME=?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, categoryName);
			rs = ps.executeQuery();
			//System.out.println(categoryName);
			//System.out.println("여기까진 오니?");
			//System.out.println(rs.next());
			while(rs.next()) {
				GoodsDTO goodsDto = 
						new GoodsDTO(rs.getDouble(1), 
									 rs.getString(2), 
									 rs.getString(3)); //생성자 오버로딩 했음
				list.add(goodsDto);
				//System.out.println(goodsDto+"뭐야뭐야");
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
	public GoodsDTO selectOneProduct(String goodsName) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDTO goodsDto = null;
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "SELECT PRICE, NAME, IMG_PATH, SUMNAIL_PATH, COLOR_CODE, SIZE_CODE, (PRICE*COUNT) AS TOTAL, GOODS_ID  FROM GOODS WHERE NAME = ?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, goodsName);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				goodsDto = new GoodsDTO(rs.getDouble(1), rs.getString(2), rs.getString(3), rs.getString(4),
								 rs.getInt(5), rs.getInt(6), rs.getInt(7)); //생성자 오버로딩 했음
				goodsDto.setGoodsId(rs.getLong("GOODS_ID"));
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

	
	@Override
	public GoodsDTO selectById(long goodsId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		GoodsDTO goodsDto = null;
		String sql = "SELECT PRICE, NAME, IMG_PATH, SUMNAIL_PATH, COLOR_CODE, SIZE_CODE, (PRICE*COUNT) AS TOTAL, GOODS_ID  FROM GOODS WHERE GOODS_ID = ?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setLong(1, goodsId);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				goodsDto = new GoodsDTO(rs.getDouble(1), rs.getString(2), rs.getString(3), rs.getString(4),
								 rs.getInt(5), rs.getInt(6), rs.getInt(7)); //생성자 오버로딩 했음
				goodsDto.setGoodsId(rs.getLong("GOODS_ID"));
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return goodsDto;
	}
}
