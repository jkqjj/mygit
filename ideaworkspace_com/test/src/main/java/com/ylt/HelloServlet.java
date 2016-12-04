package com.ylt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by qianjiajia on 2016/11/11.
 */
public class HelloServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException{
        //执行必须的初始化
        message = "Hello Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        //设置响应内容类型
        response.setContentType("text/html");

        //实际的逻辑
        PrintWriter out = response.getWriter();
        out.println("<h1>"+message+"</h1>");
    }

    public void destory(){

    }
}
