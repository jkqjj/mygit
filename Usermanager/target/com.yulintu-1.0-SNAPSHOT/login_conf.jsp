<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/21
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>数据库管理员登陆</title>
</head>
<body>
<center>
    <h1>数据库管理员登陆成功</h1><hr><br>
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
        String sql  = "select username,password,userSex form user where username =? && password=? && userSex =?";
        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "jiajia");
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            pstmt.setString(3,userSex);
            rs = pstmt.executeQuery();
            if (rs.next()){
                flag =true;
            }
            rs.close();
            pstmt.close();
        }catch (Exception e){

        }
    %>
    <%
        if (flag){
    %>
    <jsp:forward page="SearchList.jsp"/>
    <%
        }else {
    %>
    <jsp:forward page="login_failure.jsp"/>
    <%
        }
    %>
</center>
</body>
</html>
