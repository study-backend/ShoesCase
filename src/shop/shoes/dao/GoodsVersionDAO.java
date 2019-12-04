package shop.shoes.dao;

import java.sql.SQLException;

import shop.shoes.model.GoodsVersionDTO;

public interface GoodsVersionDAO {
	
	public GoodsVersionDTO selectNewVersion() throws SQLException;

}
