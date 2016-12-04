package com.yulintu.login.dao.web;

import com.yulintu.login.dao.domain.User;
import com.yulintu.login.dao.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qianjiajia on 2016/11/14.
 */
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username,password);

        Map<String,String> errors = new HashMap<String,String>();

        if (StringUtils.isEmpty(user.getUserName())){
            //resp.getWriter().write("用户名不能为空!");
            //return;
            errors.put("username","用户名错误！");
        }

        if (StringUtils.isEmpty(user.getPassword())){
            //resp.getWriter().write("密码不能为空!");
            //return;
            errors.put("password","密码错误！");
        }

        if (errors.size() > 0){
            req.setAttribute("errors",errors);
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }

        //resp.getWriter().write("欢迎" + user.getUserName() + "登录!");
        req.getSession().setAttribute("user",user);
        resp.sendRedirect("/main.jsp");

    }
}
