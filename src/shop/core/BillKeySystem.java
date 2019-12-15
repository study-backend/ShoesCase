package shop.core;

import java.sql.Date;
import java.util.UUID;

import shop.shoes.dao.BillKeyDAO;
import shop.shoes.dao.BillKeyDAOImpl;
import shop.shoes.model.BillKeyDTO;
import shop.util.DateTimeHelper;

public class BillKeySystem {
	
	private static BillKeyDAO billkeyDao = new BillKeyDAOImpl();

	public BillKeySystem() {
		
	}
	
	public String issueBillKey() throws Exception {
		
		// 새로운 키 발급 
		UUID uuid = UUID.randomUUID();
		
		// 기존에 있는 키인지 확인한다
		BillKeyDTO key = billkeyDao.select(uuid.toString());
		if(key == null) {
			return uuid.toString();
		}
		
		return "";
	}
	
	public int registerPurchase(String billKey, Date date) throws Exception {
		
		BillKeyDTO key = new BillKeyDTO();
		key.setBillKey(billKey);
		key.setIssueDate(date);
		key.setCancelDate(DateTimeHelper.convertSqldate(DateTimeHelper.dateFormatUtil("yyyy-MM-dd", "1900-01-01")));
		key.setCreateDate(DateTimeHelper.sqlDateNow());
		key.setUpdateDate(DateTimeHelper.sqlDateNow());
		
		int result = 0;
		result = billkeyDao.insert(key);
		return result;
	}
	
	public int registerCancel(String billKey, Date date) throws Exception {
		
		BillKeyDTO key = new BillKeyDTO();
		key.setCancelDate(date);
		key.setUpdateDate(date);
		
		int result = 0;
		
		result = billkeyDao.update(key);
		return result;
	}

}
