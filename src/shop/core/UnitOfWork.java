package shop.core;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface UnitOfWork {
	
	PreparedStatement beginTransaction(String sql) throws SQLException;
	
    void commit() throws SQLException;
    
    void rollback() throws SQLException;

	void endTransaction() throws SQLException;


    
}
