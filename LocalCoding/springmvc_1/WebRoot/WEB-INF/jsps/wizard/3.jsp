<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>3.jsp</title>
  </head>
  
  <body>
    <form action="<%=path %>/mywizardform.action" method="post">
    	address:<input type="text" name="address" value="${requestScope.person.address }"><br>
    	<input type="submit" name="_target1" value="上一步">
    	<input type="submit" name="_cancel" value="取消">
    	<input type="submit" name="_finish" value="完成">
    </form>
  </body>
</html>
