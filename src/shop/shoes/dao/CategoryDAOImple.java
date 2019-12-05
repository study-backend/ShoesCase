package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.CategoryDTO;
import shop.util.DbUtil;

public class CategoryDAOImple implements CategoryDAO {

	@Override
	public List<CategoryDTO> selectAll() throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CategoryDTO> list = new ArrayList<CategoryDTO>();
		String sql = "SELECT * FROM category";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {

				list.add(new CategoryDTO(rs.getLong("CATEGORY_ID")
						, rs.getInt("SORT_ORDER")
						, rs.getString("NAME")
						, rs.getDate("CREATE_DATE")
						, rs.getDate("UPDATE_DATE")
						));
			}
			
		}finally {
			DbUtil.dbClose(rs, ps, con);		
		}
		return list;
	}

}
