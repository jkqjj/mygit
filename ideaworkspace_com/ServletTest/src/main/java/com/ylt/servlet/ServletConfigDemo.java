package com.ylt.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by qianjiajia on 2016/11/22.
 */

@WebServlet(
        urlPatterns = {"/servletConfigDemo.do"},
        loadOnStartup = 1,
        name = "ServletConfigDemo",
        displayName = "demo",
        initParams = {
                @WebInitParam(name = "success",value = "success.html"),
                @WebInitParam(name = "error",value = "error.html")
        }
)

public class ServletConfigDemo extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        //获取ServletConfig对象
        ServletConfig config = getServletConfig();

        String success = config.getInitParameter("success");
        String error = config.getInitParameter("error");

        System.out.println("success--------"+success);
        System.out.println("error--------"+error);

        Enumeration enumeration = config.getInitParameterNames();
        while (enumeration.hasMoreElements()){
            String name = (String) enumeration.nextElement();
            String value = config.getInitParameter(name);
            System.out.println("name--------"+name);
            System.out.println("value--------"+value);
        }

        ServletContext servletContext = config.getServletContext();
        System.out.println("servletContext--------"+servletContext);


        String servletName = config.getServletName();
        System.out.println("servletName--------"+servletName);

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        if (userId != null && "root".equals(userId)&&password != null &&"jiajia".equals(password)){
            HttpSession session = request.getSession();

            session.setAttribute("user",userId);

            RequestDispatcher dispatcher = request.getRequestDispatcher(success);
            dispatcher.forward(request,response);
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher(error);
            dispatcher.forward(request,response);
        }
    }
}
