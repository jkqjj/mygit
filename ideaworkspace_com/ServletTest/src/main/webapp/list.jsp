<%--
  Created by IntelliJ IDEA.
  User: qianjiajia
  Date: 2016/11/23
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>在线用户列表</h2>
<%
    Set all = (Set)request.getServletContext().getAttribute("online");
    Iterator iterator = all.iterator();
    while (iterator.hasNext()){
%>
<%=iterator.next()%>
<%
    }
%>
</body>
</html>
