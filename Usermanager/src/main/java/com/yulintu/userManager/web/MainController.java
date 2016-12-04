package com.yulintu.userManager.web;

import com.yulintu.userManager.dao.RegisterDao;
import com.yulintu.userManager.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiajiaQian on 2016/11/18.
 */
public class MainController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        doGet(request,response);
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String usersex = request.getParameter("usersex");
//        User user = new User(username,password,usersex);
//        request.getSession().setAttribute("user",user);
//        response.sendRedirect("/login.jsp");
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setCharacterEncoding("UTF-8");
        RegisterDao loginDao = new RegisterDao();
        List<User> userList = new ArrayList<User>();
        List<User> list= loginDao.findAll();
        request.setAttribute("userList", list);
        request.getRequestDispatcher("/main.jsp").forward(request,response);

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usersex = request.getParameter("sex");
        User user = new User(username,password,usersex);
        request.getSession().setAttribute("user",user);
        response.sendRedirect("/login.jsp");
    }
}
