<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/21
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html ; charset = UTF-8">

    <title>更新</title>
</head>
<body>
<center>
    <font color="red" size="72" >用户管理页面</font>
    <hr>
    <form action="Update" method="post">
        <table border="1">
            <tr>
                <td>用户ID:</td>
                <td><input name="userId" value="<%=request.getAttribute("userId")%>"readonly></td>
            </tr>
            <tr>
                <td>学生姓名:</td>
                <td><input name="username" value="<%=request.getAttribute("username")%>"></td>
            </tr>
            <tr>
                <td>学生密码:</td>
                <td><input type="password" name="password" value="<%=request.getAttribute("password")%>"></td>
            </tr>
            <tr>
                <td>学生性别:</td>
                <td><input type="radio" name="userSex" value="男"<%=request.getAttribute("man")%>>男
                    <input type="radio" name="userSex" value="女"<%=request.getAttribute("woman")%>>女
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <center>
                        <input type="submit" value="提交">
                        <input type="reset" value="重置">
                    </center>
                </td>
            </tr>
        </table>
    </form>
    <a href="SearchList.jsp">返回主页面</a>
</center>
</body>
</html>
