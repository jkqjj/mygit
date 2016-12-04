package com.yulintu.userManager.web;

import com.yulintu.userManager.dao.SqlDao;
import com.yulintu.userManager.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jiajiaQian on 2016/11/21.
 */
public class Update extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doDelete(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {

    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        //获取前台表单信息
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usersex = request.getParameter("userSex");

        //封装到User对象中去
        User user = new User();
        user.setUserId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setUserSex(usersex);

        String sql = "update usermanager set username = ?,password=?,userSex=? where userId=?";
        SqlDao sqlDao = new SqlDao();
        int count = sqlDao.getUpdate(sql,user);
        String url = "";
        if (count>0){
            url = "SearchList.jsp";
        }else {
            url = "Error.jsp";
            request.setAttribute("error","更新");
        }
        request.getRequestDispatcher(url).forward(request,response);

    }
}
