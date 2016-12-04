package Java_web;

/**
 * Created by qianjiajia on 2016/11/23.
 */

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * 对用户请求状态的监听
 */
public class ServletRequestListenerDemo implements ServletRequestListener{
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("**request初始化.http://"+servletRequestEvent.getServletRequest().getRemoteAddr()+servletRequestEvent.getServletContext().getContextPath());
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("**request销毁.http://"+servletRequestEvent.getServletRequest().getRemoteAddr()+servletRequestEvent.getServletContext().getContextPath());

    }
}
