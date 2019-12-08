package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import shop.shoes.model.BillKeyDTO;
import shop.util.DbUtil;

public class BillKeyDAOImpl implements BillKeyDAO {

	@Override
	public BillKeyDTO select(String billkey) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BillKeyDTO key = null;
		String sql = "SELECT * FROM bill_key";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, billkey);
			rs = ps.executeQuery();

			if (rs.next()) {

				key = new BillKeyDTO(rs.getString("BILL_KEY"), 
						rs.getDate("ISSUE_DATE"), rs.getDate("CANCEl_DATE"),
						rs.getDate("CREATE_DATE"), rs.getDate("UPDATE_DATE"));
			}

		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return key;
	}

	@Override
	public int update(BillKeyDTO bill) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "UPDATE BILL_KEY SET CANCEl_DATE = ?, UPDATE_DATE = ?)";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setDate(1, bill.getCancelDate());
			ps.setDate(2, bill.getUpdateDate());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int insert(BillKeyDTO bill) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		String sql = "INSERT INTO BILL_KEY values(?,?,?,?,? )";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, bill.getBillKey());
			ps.setDate(2, bill.getIssueDate());
			ps.setDate(3, bill.getCancelDate());
			ps.setDate(4, bill.getCreateDate());
			ps.setDate(5, bill.getUpdateDate());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

}
