package shop.listener;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import shop.shoes.controller.Controller;




@WebListener
public class HandlerMappingListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { }

    public void contextInitialized(ServletContextEvent e)  { 
    	ServletContext application = e.getServletContext();
    	String fileName = application.getInitParameter("fileName");
    	
    	Map<String, Controller> map = new HashMap<String, Controller>();
    	
        //�ܺ� properties���� �ε�
    	//ResourceBundle�� properties �о���� ���� Ŭ�����μ�
    	//Ȯ���ڴ� �����Ѵ�.
    	ResourceBundle rb = ResourceBundle.getBundle(fileName);
    	Set<String> keys = rb.keySet();
    	try {
	    	for(String key : keys) {
	    		String value = rb.getString(key);
	    		//System.out.println(key+" = " + value);
	    		//String�� -> ��ü�� �����Ѵ�.
	    	  Controller con=
	    	   (Controller)Class.forName(value).newInstance();
	    		//System.out.println(con);
	    		map.put(key, con);
	    	}
    	}catch (Exception ex) {
			ex.printStackTrace();
		}
    	
    	application.setAttribute("map", map);
    }
	
}









