package shop.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger : logback - 현재 한개로만 사용하려다보니 실제 로그가 찍힌 클래스 이름이 나오지 않는다.. 
 * 해당 부분에 대한 수정이나 조치가 필요하나 일단 임시 방편 LoggerFactory.getLogger(Logback.class);
 * 잠깐 찾아보니 wrapper에 대한 부정적인 글들이 있다 가급적이면 모든 클래스마다 위에서 선언하고 사용해야 하나보다
 * 싱글턴 개념으로 사용했을 때 class 네임위치를 변경시킬수 있는 방법을 찾아야 겠다
 */

public class Logback {

	private static final Logger logger = LoggerFactory.getLogger(Logback.class);

	
    public Logback() {
      
    }
    
    public static void debug(String str) {
    	Logback.logger.debug(str);;
    }

}
