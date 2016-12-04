<%--
  Created by IntelliJ IDEA.
  User: qianjiajia
  Date: 2016/11/23
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Java_web.*" %>
<%
    LoginUser user = new LoginUser("java");
    session.setAttribute("info",user);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
