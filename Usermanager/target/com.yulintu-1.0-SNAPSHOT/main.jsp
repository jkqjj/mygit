<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/17
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
<center>
<a href="/login">用户登陆</a>
<table border="1" cellspacing="0" cellpadding="0" width="300" style="align:center;">
    <thead>
    <tr style="font-weight:bold;">
        <th>用户ID</th>
        <th>用户名称</th>
        <th>用户密码</th>
        <th>用户性别</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user" >
        <tr>
            <td>${user.userId}</td>
            <td>${user.username }</td>
            <td>${user.password }</td>
            <td>${user.userSex }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</center>
</body>
</html>
