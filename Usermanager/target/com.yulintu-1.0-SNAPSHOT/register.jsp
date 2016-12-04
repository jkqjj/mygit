<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/18
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<c:forEach items="${errors}" var="error">
    <font color="red">${error.key}</font>
    ${error.value}</br>
</c:forEach>
<body>
<center>
    <h3>欢迎注册</h3>
    <form action="/register" method="post">
        <table>
            <tr>
                <td>用户姓名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>用户密码:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>用户性别:</td>
                <td><input type="radio" name="usersex" value="男">男
                    <input type="radio" name="usersex" value="女">女</td>
            </tr>
            <tr>
                <td><input type="submit" value="注册"></td>
                <td><input type="reset" value="取消"></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
