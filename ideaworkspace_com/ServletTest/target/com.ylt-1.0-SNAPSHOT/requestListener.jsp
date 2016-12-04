/**
 * Created by qianjiajia on 2016/11/22.
 */
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>

<html>
<head>
    <title>使用RequesteListener监听器</title>
</head>
<body>
使用RequesteListener监听器<br>
<c:set value="zhangsan" var="username" scope="request"/>
姓名为:<c:out value="${requestScope.username}"/>
<c:remove var="username" scope="request"/>
</body>
</html>
