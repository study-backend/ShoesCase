package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.util.DbUtil;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public List<AccountDTO> selectAll() throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		String sql = "SELECT * FROM account";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				// ���밡��.. 18..
				list.add(new AccountDTO(rs.getLong("ACCOUNT_ID")
						, rs.getString("LOGIN_ID")
						, rs.getString("LOGIN_PWD")
						, rs.getString("NAME")
						, rs.getString("PHONE")
						, rs.getString("EMAIL")
						, rs.getString("ADDR")
						, rs.getString("SEX").charAt(0)
						, rs.getDate("BIRTHDAY")
						//, rs.getDate("LOGIN_DATE")
						//, rs.getDate("LOGOUT_DATE")
						, rs.getInt("TERMS_VERSION")
						, rs.getDate("TERMS_AGREE_DATE")
						, rs.getDate("CREATE_DATE")
						, rs.getDate("UPDATE_DATE")
						, rs.getDate("DELETE_DATE")));
			}
			
		}finally {
			DbUtil.dbClose(rs, ps, con);		
		}
		return list;
	}

	@Override
	public int insert(AccountDTO account) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		String sql = "INSERT INTO account values(?,?,?,?,?,?,?,?,?,?,sysdate, sysdate,sysdate, sysdate )";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setLong(1, account.getAccountId());
			ps.setString(2, account.getLoginId());
			ps.setString(3, account.getLoginPwd());
			ps.setString(4, account.getName());
			ps.setString(5, account.getPhone());
			ps.setString(6, account.getEmail());
			ps.setString(7, account.getAddr());
			ps.setString(8, String.valueOf(account.getSex()));
			ps.setDate(9, account.getBirthday());
			//ps.setDate(10, account.getLoginDate());
			//ps.setDate(11, account.getLogoutDate());
			ps.setInt(10, account.getTermsVersion());

			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int update(AccountDTO account) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		String sql = "UPDATE account SET account_id = ?, phone = ?, email = ?, addr = ? terms_version = ? terms_agree_date = ? update_date = sysdate WHERE account_id = ?)";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, account.getLoginPwd());
	
			ps.setString(2, account.getPhone());
			ps.setString(3, account.getEmail());
			ps.setString(4, account.getAddr());

			ps.setInt(5, account.getTermsVersion());
			ps.setDate(6, account.getTermsAgreeDate());
			
			ps.setLong(7, account.getAccountId());
	
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int delete(int accountId) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		String sql = "UPDATE account SET delete_date = sysdate WHERE account_id = ?)";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setLong(1, accountId);
	
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public AccountDTO selectById(long accountId) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		AccountDTO account = new AccountDTO();
		String sql = "SELECT * FROM account WHERE account_id = ";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setLong(1, accountId);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				// ���밡��.. 18..
				account = new AccountDTO(rs.getLong("ACCOUNT_ID")
						, rs.getString("LOGIN_ID")
						, rs.getString("LOGIN_PWD")
						, rs.getString("NAME")
						, rs.getString("PHONE")
						, rs.getString("EMAIL")
						, rs.getString("ADDR")
						, rs.getString("SEX").charAt(0)
						, rs.getDate("BIRTHDAY")
						//, rs.getDate("LOGIN_DATE")
						//, rs.getDate("LOGOUT_DATE")
						, rs.getInt("TERMS_VERSION")
						, rs.getDate("TERMS_AGREE_DATE")
						, rs.getDate("CREATE_DATE")
						, rs.getDate("UPDATE_DATE")
						, rs.getDate("DELETE_DATE"));
			}
			
		}finally {
			DbUtil.dbClose(rs, ps, con);		
		}
		return account;
	}
	
}
