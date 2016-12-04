package com.ylt.servlet;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Created by qianjiajia on 2016/11/22.
 */
public abstract class GenericServlet implements Servlet,ServletConfig,Serializable{

    private Logger logger = Logger.getLogger(GenericServlet.class.getName());

    private transient ServletConfig config;
    //GenericServlet默认的构造方法
    public GenericServlet(){}
    //GenericServlet默认的销毁方法
    public void destory(){
        logger.info("destory");
    }

    //获取初始化参数方法
    public String getInitparameter(String name){
        return getServletConfig().getInitParameter(name);
    }

}
