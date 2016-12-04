package com.ylt.servlet;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

/**
 * Created by qianjiajia on 2016/11/22.
 */
@WebListener
public class MyRequestListener implements ServletRequestListener,ServletRequestAttributeListener {

    private static Logger log = Logger.getLogger(MyRequestListener.class.getName());

    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        log.info("加入一个request范围的属性,名称为:"+servletRequestAttributeEvent.getName()+"其值为:"+servletRequestAttributeEvent.getValue());
    }

    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        log.info("移除一个request范围的属性,名称为:"+servletRequestAttributeEvent.getName());
    }

    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        log.info("修改一个request范围的属性,名称为:"+servletRequestAttributeEvent.getName()+",修改前的值为:"+servletRequestAttributeEvent.getValue());
    }

    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        log.info("一个请求消亡");
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        log.info("产生了一个新的请求");
    }
}
