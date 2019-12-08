package shop.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateTimeHelper {

	//sql.date
	//util.data
	//timestamp 
	// 위 3개의 타입간 쉬운 형변환과 오라클에 대응하기 쉽게 만든 helper 구현 하기....
	
	public static java.sql.Date sqlDateNow() {
		return java.sql.Date.valueOf(LocalDate.now());
	}
	
	public static java.sql.Date sqlDate(String date) {
		// 예외 처리 나중에 ㅜㅠㅜ IllegalArgumentException
		return java.sql.Date.valueOf(date);
	}
	
	public static java.sql.Date sqlDate(long timeMillis) {
		return new java.sql.Date(timeMillis);
	}
	
	public static java.sql.Timestamp timeStampNow() {
		return java.sql.Timestamp.valueOf(LocalDateTime.now());
	}
	
	public static java.sql.Timestamp timeStamp(String date) {
		// 예외 처리 나중에 ㅜㅠㅜ IllegalArgumentException
		return java.sql.Timestamp.valueOf(date);
	}
	
	public static java.sql.Timestamp timeStamp(long timeMillis) {
		return new java.sql.Timestamp(timeMillis);
	}
	
	public static java.sql.Date convertSqldate(java.util.Date date) {
		return new java.sql.Date(date.getTime());
	}
	
	public static java.util.Date dateFormatUtil(String format, String date) {
		
		if(format == null) {
			format = "yyyyMMdd hh:mm:ss";
		}
				
		DateFormat formatter = new SimpleDateFormat(format);
		try {
			return formatter.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new java.util.Date();
	}
	
	public static String dateFormatString(String format) {
		if(format == null) {
			format = "yyyyMMdd hh:mm:ss";
		}
				
		DateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(new java.util.Date());
	}
	
	
	
}
