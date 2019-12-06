
package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.PurchaseBasketDTO;
import shop.shoes.model.PurchaseBasketPaymentDTO;
import shop.shoes.model.PurchaseGoodsDTO;
import shop.util.DbUtil;

public class PurchaseDAOImpl implements PurchaseDAO {

	@Override
	public List<PurchaseGoodsDTO> selectProduct(String billKey) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		PurchaseGoodsDTO basket = null;
		List<PurchaseGoodsDTO> list = new ArrayList<PurchaseGoodsDTO>();
		String sql = "select NAME, PRICE, IMG_PATH from PURCHASE_GOODS where BILL_KEY = ?"; //billkey로 찾는건지 모르겠음
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, billKey);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				basket = new PurchaseGoodsDTO(rs.getString(1), rs.getInt(2), rs.getString(3));
				list.add(basket);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

	@Override
	public AccountDTO selectOrderer(String loginId) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		AccountDTO account = null;
		String sql = "select NAME, PHONE, EMAIL, ADDR from ACCOUNT where LOGIN_ID=?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, loginId);
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
	public int recieverInfo(PurchaseBasketPaymentDTO pbp) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into PURCHASE_BASKET_PAYMENT(PAYMENT_TYPE, RECIEVER_NAME, RECIEVER_PHONE, DILIVERY_COMMENT "
				+ "values(?,?,?,?)";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setInt(1, pbp.getPaymentType());
			ps.setString(2, pbp.getRecieverName());
			ps.setString(3, pbp.getRecieverPhone());
			ps.setString(4, pbp.getDeliveryComment());
			result = ps.executeUpdate();
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}


	
	@Override
	public int paymentWay(int paymentType) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into PURCHASE_BASKET_PAYMENT(PAYMENT_TYPE) values(?)";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setInt(1, paymentType);
			result = ps.executeUpdate();
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	@Override
	public int insertAllBasket(PurchaseBasketDTO basket) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into PURCHASE_BASKET(PURCHASE_BASKET_ID, ACCOUNT_ID, TOTAL_PRICE, ORDER_DATE, "
				+ "IMG_PATH, STATE_CODE, BILL_KEY, DELEVERY_ADDR, CREATE_DATE, UPDATE_DATE) values(?,?,?,?,?,?,?,?,sysdate,sysdate)";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setLong(1, basket.getBasketId());
			ps.setLong(2, basket.getAccountId());
			ps.setInt(3, basket.getTotalPrice());
			ps.setString(4, basket.getOrderDate());
			ps.setString(5, basket.getImgPath());
			ps.setInt(6, basket.getStateCode());
			ps.setString(7, basket.getBillKey());
			ps.setString(8, basket.getDeliveryAddr());
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	@Override
	public int insertPurchaseInfo(PurchaseGoodsDTO purchaseGoods) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "";
		try {
			con = DbUtil.getConnection();
			
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	//하나의 계정마다 구매내역 보기
	@Override
	public List<PurchaseGoodsDTO> selectOrderHistory(String loginId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		PurchaseGoodsDTO basket = null;
		List<PurchaseGoodsDTO> list = new ArrayList<PurchaseGoodsDTO>();
		String sql = "select B1.BILL_KEY, P1.NAME,P1.PRICE,P1.COUNT, P1.STATE_CODE "
				+ "from PURCHASE_GOODS P1 inner join BILL_KEY B1 on P1.BILL_KEY = B1.BILL_KEY "
				+ "inner join ACCOUNT A1 on A1.ACCOUNT_ID = P1.ACCOUNT_ID " + 
				"where A1.LOGIN_ID = ?"; 
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1,loginId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				basket = new PurchaseGoodsDTO(rs.getString(1), rs.getString(2), 
											rs.getDouble(3), rs.getInt(4), rs.getInt(5));
				list.add(basket);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}
	
}
