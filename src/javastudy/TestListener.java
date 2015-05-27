package javastudy;

import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
@WebListener
public class TestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	HashMap<String, String> map=new HashMap<String,String>();
    	map.put("张三", "123456");
    	map.put("李四", "123456");
    	map.put("王五", "123456");
    	
    	arg0.getServletContext().setAttribute("USERS",map);
    	
    	HashMap<String, String> mapRight=new HashMap<String,String>();
    	mapRight.put("张三", "p1.jsp");
    	mapRight.put("李四", "p2.jsp");
    	
    	arg0.getServletContext().setAttribute("RIGHTS",mapRight);
    }
	
}
