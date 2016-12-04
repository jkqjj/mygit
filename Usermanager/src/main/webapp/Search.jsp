<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/21
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset = UTF-8">
    <title>显示记录</title>
</head>
<body>
<form name="form" action="Insert.jsp" method="post">
    <center>
        <font color="red" size="72">信息如下:</font><br><br>
        用户ID:<%= request.getAttribute("userId")%><br>
        用户姓名:<%=request.getAttribute("username")%><br>
        用户密码:<%=request.getAttribute("password")%><br>
        用户性别:<%if(request.getAttribute("man").equals("男")){%>
        <%=request.getAttribute("man")%>
        <%
        }else{
        %>
        <%=request.getAttribute("woman")%>
        <%
            }
        %><br>
        <a href="SearchList.jsp">返回主页面</a>
    </center>
</form>
</body>
</html>
