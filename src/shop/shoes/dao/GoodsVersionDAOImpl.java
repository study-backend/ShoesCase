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
		GoodsVersionDTO version = new GoodsVersionDTO();
		String sql = "SELECT * FROM goodsversion orderby update_date";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				// 개노가다.. 18..
				version = new GoodsVersionDTO();
			}
			
		}finally {
			DbUtil.dbClose(rs, ps, con);		
		}
		return version;
	}

}
