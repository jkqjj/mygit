<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>personForm.jsp</title>
  </head>
  
  <body>
    <form action="<%=path %>/myform.action" method="POST">
    	id:<input type="text" name="id"><br>
    	name:<input type="text" name="name"><br>
    	address:<input type="text" name="address"><br>
    	<input type="submit" value="提交">
    </form>
  </body>
</html>
