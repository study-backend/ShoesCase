package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsVersionDTO;
import shop.util.DbUtil;

public class GoodsVersionDAOImpl implements GoodsVersionDAO {

	@Override
	public GoodsVersionDTO selectNewVersion() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsVersionDTO version = null;
		String sql = "SELECT * FROM goods_version order by update_date desc";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
	
				version = new GoodsVersionDTO(rs.getLong(1), rs.getString(2), rs.getDate(3), rs.getDate(4));
			}
			
		}finally {
			DbUtil.dbClose(rs, ps, con);		
		}
		return version;
	}

}
