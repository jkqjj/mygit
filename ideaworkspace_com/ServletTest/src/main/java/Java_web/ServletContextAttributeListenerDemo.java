package Java_web;

/**
 * Created by qianjiajia on 2016/11/23.
 */

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * 上下文属性监听
 */
public class ServletContextAttributeListenerDemo implements ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("**增加属性-->属性名称:"+servletContextAttributeEvent.getName()+",属性内容"+servletContextAttributeEvent.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("**删除属性-->属性名称:"+servletContextAttributeEvent.getName()+",属性内容"+servletContextAttributeEvent.getValue());

    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("**增加替换-->属性名称:"+servletContextAttributeEvent.getName()+",属性内容"+servletContextAttributeEvent.getValue());

    }
}
