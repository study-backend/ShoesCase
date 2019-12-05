package shop.util;

public class StringHelper {
	
	public static String findString(String source, String name) {
		// 특정단어(부분)만 자르기
		int targetNumber = source.indexOf(name); 
		String result = source.substring(targetNumber, (source.substring(targetNumber).indexOf("&") + (targetNumber-1)));
		//System.out.println(result); 
		return result;
	}
}
