package shop.listener;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import shop.core.Logback;
import shop.shoes.controller.Controller;

/**
 * Application Lifecycle Listener implementation class HandlerMappingListener2
 *
 */
@WebListener
public class HandlerMappingListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public HandlerMappingListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent e)  { 
    	Logback.debug("HandlerMappingListener start");
    	ServletContext application = e.getServletContext();
    	String fileName = application.getInitParameter("fileName");
    	
    	Map<String, Controller> map = new HashMap<String, Controller>();
    	
        //외부 properties파일 로딩
    	//ResourceBundle는 properties 읽어오는 전용 클래스로서
    	//확장자는 생략한다.
    	ResourceBundle rb = ResourceBundle.getBundle(fileName);
    	Set<String> keys = rb.keySet();
    	try {
	    	for(String key : keys) {
	    		String value = rb.getString(key);
	    		Logback.debug(key+" = " + value);
	    		
	    		//String을 -> 객체로 생성한다.
	    	    Controller con= (Controller)Class.forName(value).newInstance();
	    		//System.out.println(con);
	    		map.put(key, con);
	    	}
    	}catch (Exception ex) {
			ex.printStackTrace();
		}
    	
    	application.setAttribute("map", map);
    }
	
}
