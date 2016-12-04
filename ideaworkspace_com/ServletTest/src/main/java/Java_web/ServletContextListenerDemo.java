package Java_web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by qianjiajia on 2016/11/23.
 */

/**
 * s上下文状态监听
 */
public class ServletContextListenerDemo implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("**容器初始化-->"+servletContextEvent.getServletContext().getContextPath());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("**容器销毁-->"+servletContextEvent.getServletContext().getContextPath());
    }
}
