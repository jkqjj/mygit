package Java_web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class OnlineUserList implements HttpSessionAttributeListener ,HttpSessionListener,ServletContextListener{

    //用户application属性操作
    private ServletContext app = null;

    /**
     * 上下文初始化
     * 取得ServletContext实例
     * 设置空集合
     * @param servletContextEvent
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        this.app = servletContextEvent.getServletContext();
        this.app.setAttribute("online",new TreeSet());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    /**
     * 增加session属性
     * 取出已有列表
     * 增加新的用户
     * 重新保存
     * @param httpSessionBindingEvent
     */
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        Set all = (Set)this.app.getAttribute("online");
        all.add(httpSessionBindingEvent.getValue());
        this.app.setAttribute("online",all);
    }

    /**
     * 取出已有列表
     * 删除离开用户
     * 重新保存
     * @param httpSessionBindingEvent
     */
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        Set all = (Set)this.app.getAttribute("online");
        all.remove(httpSessionBindingEvent.getValue());
        this.app.setAttribute("online",all);
    }

    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    /**
     * 取出已有列表
     * 去除设置的内容
     * 重新保存
     * @param httpSessionEvent
     */
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        Set all  = (Set)this.app.getAttribute("online");
        all.remove(httpSessionEvent.getSession().getAttribute("userid"));
        this.app.setAttribute("online",all);
    }
}
