package Java_web;

/**
 * Created by qianjiajia on 2016/11/23.
 */

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 对session的z状态监听
 */
public class HttpSessionListenerDemo implements HttpSessionListener{
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("**SESSION创建,SESSION ID ="+httpSessionEvent.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("**SESSION销毁,SESSION ID ="+httpSessionEvent.getSession().getId());
    }
}
