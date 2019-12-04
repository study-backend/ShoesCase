package shop.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.GoodsDTO;
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


//	@Override
//	public List<GoodsDTO> selectAllBasket(String billKey) throws SQLException{
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		GoodsDTO goods = null;
//		List<GoodsDTO> list = new ArrayList<GoodsDTO>();
//		String sql = "select B1.IMG_PATH, G1.NAME, G1.COUNT, G1.PRICE, B1.TOTAL_PRICE"
//				+ " from PURCHASE_GOODS G1 inner join PURCHASE_BASKET B1 on "
//				+ "G1.PURCHASE_BASKET_ID = B1.PURCHASE_BASKET_ID where G1.BILL_KEY = ?";
//		try {
//			con = DbUtil.getConnection();
//			ps= con.prepareStatement(sql);
//			ps.setString(1, billKey);
//			rs = ps.executeQuery();
//			while(rs.next()) {
//				
//			}
//		}
//		finally {
//			DbUtil.dbClose(rs, ps, con);
//		}
//		return list;
//	}
	
	
	//환불기능 나중에 시간되면 하는걸로
//	@Override
//	public int deletePurchase(PurchaseGoods purchaseGoods) throws SQLException{
//		Connection con = null;
//		PreparedStatement ps = null;
//		int result = 0;
//		String sql = "";
//		try {
//			con = DbUtil.getConnection();
//			ps= con.prepareStatement(sql);
//			
//			
//		}
//		finally {
//			DbUtil.dbClose(ps, con);
//		}
//		return result;
//	}
	

	@Override
	public List<PurchaseGoodsDTO> selectOrderHistory(long accountId) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<PurchaseGoodsDTO> list = new ArrayList<PurchaseGoodsDTO>();
		String sql = "select STATE_CODE, NAME, BILL_KEY from PURCHASE_GOODS where ACCOUNT_ID=?";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setLong(1, accountId);
			rs = ps.executeQuery();
			while(rs.next()) {
				PurchaseGoodsDTO purchaseGoods = new PurchaseGoodsDTO(rs.getInt(1), rs.getString(2),
													rs.getString(3));
				list.add(purchaseGoods);
			}
		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

	@Override
	public int insertPurchaseInfo(PurchaseGoodsDTO purchaseGoods) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into PURCHASE_GOODS(PURCHASE_GOODS_ID, STATE_CODE, NAME, COUNT, "
				+ "PRICE, IMG_PATH, BILL_KEY, PURCHASE_BASKET_ID, GOODS_ID, CREATE_DATE, UPDATE_DATE, ACCOUNT_ID) "
				+ "values(?,?,?,?,?,?,?,?,?,sysdate,sysdate,?)";
		try {
			con = DbUtil.getConnection();
			ps= con.prepareStatement(sql);
			ps.setLong(1, purchaseGoods.getPurchaseGoodId());
			ps.setInt(2, purchaseGoods.getStateCode());
			ps.setString(3, purchaseGoods.getName());
			ps.setInt(4, purchaseGoods.getCount());
			ps.setDouble(5, purchaseGoods.getPrice());
			ps.setString(6, purchaseGoods.getImagPath());
			ps.setString(7, purchaseGoods.getBillKey());
			ps.setLong(8, purchaseGoods.getPurchaseBasketId());
			ps.setLong(9, purchaseGoods.getGoodsId());
			ps.setLong(10, purchaseGoods.getAccountId());
			result = ps.executeUpdate();
		}
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
}
