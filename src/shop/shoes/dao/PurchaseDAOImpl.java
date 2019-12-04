package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasket;
import shop.shoes.model.PurchaseGoods;
import shop.util.DbUtil;

public class PurchaseDAOImpl implements PurchaseDAO {

	@Override
	public List<PurchaseGoods> selectProduct(String billKey) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		PurchaseGoods basket = null;
		List<PurchaseGoods> list = new ArrayList<PurchaseGoods>();
		String sql = "select NAME, PRICE, IMG_PATH from PURCHASE_GOODS where BILL_KEY = ?"; //billkey�� ã�°� �´°��� �𸣰���
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, billKey);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				basket = new PurchaseGoods(rs.getString(1), rs.getInt(2), rs.getString(3));
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

	@Override
	public AccountDTO selectOrderer() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		AccountDTO account = null;
		String sql = "select NAME, PHONE, EMAIL, ADDR from ACCOUNT";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				account = new AccountDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return account;
	}

	@Override
	public int recieverInfo() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into PURCHASE_BASKET_PAYMENT(PAYMENT_TYPE, RECIEVER_NAME, RECIEVER_PHONE, DILIVERY_COMMENT "
				+ "values(?,?,?,?)";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.executeUpdate();
			
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	@Override
	public PurchaseBasket selectTotalPrice(int basketId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		PurchaseBasket basket = null;
		String sql = "select TOTAL_PRICE from PURCHASE_BASKET where PURCHASE_BASKET_ID = ?;";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setInt(1, basketId);
			rs = ps.executeQuery();
			if(rs.next()) {
				basket = new PurchaseBasket(rs.getInt(1));
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return basket;
	}
	
	@Override
	public int paymentWay() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into PURCHASE_BASKET_PAYMENT(PAYMENT_TYPE) values(?)";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			result = ps.executeUpdate();
			
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}


	@Override
	public List<GoodsDTO> selectAllBasket() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
		String sql = "";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}
	
	@Override
	public int deleteBasket(GoodsDTO goods) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			
			
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	@Override
	public List<PurchaseGoods> selectOrderHistory(AccountDTO account) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<PurchaseGoods> list = new ArrayList<PurchaseGoods>();
		String sql = "";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}



}
