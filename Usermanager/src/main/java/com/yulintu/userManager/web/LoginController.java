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
 * @author mocker
 * @Date 2016-11-14 16:58
 * @Description 处理登录
 * @Version 1.0
 */
public class LoginController extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * HttpServletResponse == 响应
         * HttpServletRequest == 请求
         */

        /**
         * 解决响应乱码
         */
        resp.setCharacterEncoding("UTF-8");

        /**
         * 解决请求乱码
         */
        req.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String usersex = req.getParameter("sex");


        User user = new User(username,password,usersex);

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
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }

        //登录成功跳转到登录页面
        req.getSession().setAttribute("user",user);
        resp.sendRedirect("/main.jsp");

    }
}