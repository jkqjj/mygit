<%--
  Created by IntelliJ IDEA.
  User: qianjiajia
  Date: 2016/11/23
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>www.java.cn</title>
</head>
<% request.setCharacterEncoding("UTF-8");%>
<body>
<h2>session属性:<%=session.getAttribute("name")%></h2>
<h2>request属性:<%=request.getAttribute("info")%></h2>
</body>
</html>
