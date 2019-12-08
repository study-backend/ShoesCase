package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class DatetimeTest {

	@Test
	final void sqlDateTest() {
		Date sqlDate1 = java.sql.Date.valueOf(LocalDate.now());
		System.out.println(sqlDate1.toString());
		
		Date sqlDate2 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(sqlDate2);
		
		Date sqlDate3 = java.sql.Date.valueOf(java.time.LocalDate.now());
		System.out.println(sqlDate3);
		
	}
	
	@Test
	final void timeStampTest() {
		Timestamp ts1 = java.sql.Timestamp.valueOf(LocalDateTime.now());
		System.out.println(ts1);
		
		Timestamp ts2 = new java.sql.Timestamp(System.currentTimeMillis());
		System.out.println(ts2);
		
		Timestamp ts3 = java.sql.Timestamp.from(java.time.Instant.now());
		System.out.println(ts3);
		
		Timestamp ts4 = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now());
		System.out.println(ts4);
	}
	
	@Test
	final void utilDateTest() {
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println(sqlDate);
		
		String str_date="1900-01-01";
	    DateFormat formatter ; 
	    java.util.Date date = null;
	    formatter = new SimpleDateFormat("yyyy-MM-dd");
	    try {
	    	date = (java.util.Date) formatter.parse(str_date);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    java.sql.Date sqlDate2 = new java.sql.Date(date.getTime());
	    System.out.println(sqlDate2);
	}
	
	@Test
	final void dateFormat() {
		java.util.Date now = new java.util.Date();

		DateFormat format1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(format1.format(now));
		DateFormat format2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(format2.format(now));
		DateFormat format3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(format3.format(now));
		DateFormat format4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(format4.format(now));
	}

}
