<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>登陆成功界面</title>
</head>
<body>
<h3>目前在线人数为: ${sessionScope.count}</h3>
<h4>欢迎你:${sessionScope.user}</h4>
<a href="<%=path%>/logot.do?userId=${sessionScope.user}">注销</a>
</body>
</html>