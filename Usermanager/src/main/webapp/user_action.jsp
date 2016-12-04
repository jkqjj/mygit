<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/21
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>添加用户信息</title>
</head>
<body>
<center>
    <br>
    <%!
        String DBDRIVER = "com.mysql.jdbc.Driver";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
    %>
    <%
        boolean flag = false;
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String userSex = request.getParameter("userSex");
    %>
    <%
        String sql = "insert into user(username,password,userSex) values (?,?,?)";
        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "jiajia");
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            pstmt.setString(3,userSex);
            pstmt.executeUpdate();
            flag = true;
        }catch (SQLException e){
            System.out.println("添加用户失败,可能存在用户名,请重新注册");
            e.printStackTrace();
        }
        try {
            pstmt.close();
            conn.close();
        }catch (Exception e){

        }

    %>
    <%
        if (flag){
            //用户合法
            response.sendRedirect("login.jsp");

    %>
    <%
        }else {
            //用户非法
            System.out.println("注册失败");

        }
    %>
</center>
</body>
</html>
