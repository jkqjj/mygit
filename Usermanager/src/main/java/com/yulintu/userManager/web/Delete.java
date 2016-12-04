package com.yulintu.userManager.web;

import com.yulintu.userManager.dao.SqlDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jiajiaQian on 2016/11/21.
 */
public class Delete  extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public void doDelete(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        //获取超链接传来你的数据
        String sId = request.getParameter("userId");
        int id = Integer.parseInt(sId);

        String sql = "delete from usermanager where userId=?";
        SqlDao sqlDao = new SqlDao();
        int count = sqlDao.getDelete(sql,id);
        String url = "";
        if (count>0){
            url = "SearchList.jsp";
        }else {
            url = "Error.jsp";
        }
        request.getRequestDispatcher(url).forward(request,response);
    }
}
