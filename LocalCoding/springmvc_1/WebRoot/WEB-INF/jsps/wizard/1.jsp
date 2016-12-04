<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>1.jsp</title>
  </head>
  
  <body>
    <form action="<%=path %>/mywizardform.action" method="post">
    	id:<input type="text" name="id" value="${requestScope.person.id }"><br>
    	<input type="submit" name="_cancel" value="取消">
    	<input type="submit" name="_target1" value="下一步">
    </form>
  </body>
</html>
