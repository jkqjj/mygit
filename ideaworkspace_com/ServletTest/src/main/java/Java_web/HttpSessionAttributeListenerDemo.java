package Java_web;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class HttpSessionAttributeListenerDemo implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(httpSessionBindingEvent.getSession().getId()+",增加属性-->属性名称:"+httpSessionBindingEvent.getName()+",属性内容:"+httpSessionBindingEvent.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(httpSessionBindingEvent.getSession().getId()+",删除属性-->属性名称:"+httpSessionBindingEvent.getName()+",属性内容:"+httpSessionBindingEvent.getValue());

    }

    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(httpSessionBindingEvent.getSession().getId()+",替换属性-->属性名称:"+httpSessionBindingEvent.getName()+",属性内容:"+httpSessionBindingEvent.getValue());

    }
}
