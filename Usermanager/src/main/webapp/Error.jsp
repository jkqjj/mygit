<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/21
  Time: 14:04
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
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>出错了！！！！</title>
</head>
<body>
抱歉！您<%=request.getAttribute("error")%>失败
</body>
</html>
