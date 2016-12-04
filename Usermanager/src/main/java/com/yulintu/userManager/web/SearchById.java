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
public class SearchById extends HttpServlet {

    private static final long serialVersionUID = 1L;
//    public void doDelete(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
//
//    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        //获取用户ID
        String sid = request.getParameter("userId");
        int id = Integer.parseInt(sid);
        String sql = "select * from usermanager where userId = ?";

        SqlDao sqlDao = new SqlDao();
        User user = sqlDao.getSearchById(sql,id);

        //用户ID
        request.setAttribute("userId",user.getUserId());

        //用户姓名
        request.setAttribute("username",user.getUsername());

        //用户密码
        request.setAttribute("password",user.getPassword());

        //用户性别
        String userSex = "";
        String man = "";
        String woman = "";
        if(user.getUserSex() != null){
            userSex = user.getUserSex().trim();
            if (userSex.equals("男")){
                man = "checked";
            }else {
                woman = "checked";
            }
        }
        request.setAttribute("man",man);
        request.setAttribute("woman",woman);

        request.getRequestDispatcher("Update.jsp").forward(request,response);
    }
}


