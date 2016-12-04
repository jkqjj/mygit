package Java_web;

/**
 * Created by qianjiajia on 2016/11/23.
 */

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * 对request属性操作的监听
 */
public class ServletRequestAttributeListenerDemo  implements ServletRequestAttributeListener{
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("**增加request属性-->属性名称:"+servletRequestAttributeEvent.getName()+"，属性内容:"+servletRequestAttributeEvent.getValue());
    }

    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("**删除request属性-->属性名称:"+servletRequestAttributeEvent.getName()+"，属性内容:"+servletRequestAttributeEvent.getValue());

    }

    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("**替换request属性-->属性名称:"+servletRequestAttributeEvent.getName()+"，属性内容:"+servletRequestAttributeEvent.getValue());

    }
}
