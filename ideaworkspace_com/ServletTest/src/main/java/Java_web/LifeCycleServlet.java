package Java_web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class LifeCycleServlet extends HttpServlet {

    public void init() throws ServletException{
        //初始化操作
        System.out.println("**1.Servlet初始化-->init()");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        //处理服务
        System.out.println("**2.Servlet服务-->doGet()/doPost()");
    }

    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        //处理服务
        this.doGet(req,resp);
    }

    public void destroy(){
        System.out.println("**3.Servlet销毁-->destroy()");
    }
}
