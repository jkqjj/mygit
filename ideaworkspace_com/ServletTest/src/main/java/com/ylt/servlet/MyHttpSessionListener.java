package com.ylt.servlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by qianjiajia on 2016/11/22.
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    private static int count;
    public  static int getCount(){
        return count;
    }

    public void sessionCreated(HttpSessionEvent e){
        MyHttpSessionListener.count++;
    }

    public void sessionDestroyed(HttpSessionEvent e){
        MyHttpSessionListener.count--;
    }
}
