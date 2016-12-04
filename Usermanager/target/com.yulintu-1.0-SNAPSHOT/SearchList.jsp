<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/21
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page import="com.yulintu.userManager.dao.SqlDao" %>
<%@ page import="com.yulintu.userManager.domain.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.ListIterator" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+
                        request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <title>显示记录</title>
</head>
<body>
<form name="form" action="Insert.jsp" method="post">
    <center>
        <font color="red" size="40">用户信息如下:</font><br><br><br>
        <hr>
        <table border="1" bgcolor="#ffffff" width=500px" height="100px">
            <tr>
                <td>用户ID</td>
                <td>用户姓名</td>
                <td>用户密码</td>
                <td>用户性别</td>
                <td><center>操作</center></td>
            </tr>
            <%
                String sql = "select * from usermanager";
                SqlDao sqlDao = new SqlDao();
                User user = new User();
                ArrayList<User> list = sqlDao.getSearch(sql);
                for (ListIterator<User> it = list.listIterator();it.hasNext();){
                    user = (User)it.next();
                }
            %>

            <tr>
                <td><%=user.getUserId()%></td>
                <td><%=user.getUsername()%></td>
                <td><%=user.getPassword()%></td>
                <td><%=user.getUserSex()%></td>
                <td>
                    <a href="Search?userId=<%=user.getUserId()%>">查询</a>
                    <a href="Delete?userId=<%=user.getUserId()%>">删除</a>
                    <a href="SearchById?userId=<%=user.getUserId()%>">更新</a>
                </td>
            </tr>

        </table><br>
        <input type="submit" value="增加"><br><br>
        <a href="login.jsp">返回登陆界面</a>
    </center>
</form>
</body>
</html>
