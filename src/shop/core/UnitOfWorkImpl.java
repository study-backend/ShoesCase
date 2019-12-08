package shop.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import shop.util.DbUtil;

public class UnitOfWorkImpl implements UnitOfWork  {
	private Connection con = null;
	private PreparedStatement ps = null;

	public UnitOfWorkImpl() throws SQLException {
		con = DbUtil.getConnection();
		con.setAutoCommit(false);                    // ??? commit ??
	}

	@Override
	public PreparedStatement beginTransaction(String sql) throws SQLException {
		
		ps = con.prepareStatement(sql);
		return ps;
	}

	@Override
	public void commit() throws SQLException {
		con.commit();

	}

	@Override
	public void rollback() throws SQLException {
		con.rollback();

	}

	@Override
	public void endTransaction() throws SQLException {
		DbUtil.dbClose(ps, con );
	}

}
