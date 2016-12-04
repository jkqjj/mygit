package com.yulintu.userManager.web;

import com.yulintu.userManager.domain.User;
import com.yulintu.userManager.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiajiaQian on 2016/11/17.
 */
public class RegisterController extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");

        req.setCharacterEncoding("UTF-8");


        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");

        User user = new User(username,password,sex);

        /**
         * 创建一个保存错误的容器
         */
        Map<String,String> errors = new HashMap<String,String>();

        //判断用户名和密码是否为空
        //判断长度
        if(StringUtils.isEmpty(user.getUsername())){
            errors.put("username","用户名错误!");
        }

        if(StringUtils.isEmpty(user.getPassword())){
            errors.put("password","密码错误!");
        }

        if(errors.size() > 0){
            req.setAttribute("errors",errors);
            req.getRequestDispatcher("/register.jsp").forward(req,resp);
            return;
        }

        //注册成功跳转到用户列表页面
//        RegisterDao loginDao = new RegisterDao();
//        List<User> userlist = new ArrayList<User>();
//        List<User> list= loginDao.findAll();
//        req.setAttribute("userlist", list);
////        req.getRequestDispatcher("/main.jsp").forward(req,resp);
//        resp.sendRedirect("/main.jsp");


//        req.getSession().setAttribute("user",user);
//        resp.sendRedirect("/main.jsp");

    }
}
