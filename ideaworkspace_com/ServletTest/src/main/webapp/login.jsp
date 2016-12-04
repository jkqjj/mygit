<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>

<c:forEach items="${errors}" var="error">
    <font color="red">${error.key}</font>
    ${error.value}</br>
</c:forEach>
<body>
<h2>用户登录</h2>
<form action="login.jsp" method="post">
    用户名:<input type="text" name="userid"><br>
    <input type="submit" value="登录">

</form>
<%
    String userid = request.getParameter("userid");
    if (!(userid == null || "".equals(userid))){
        session.setAttribute("userid",userid);
        response.sendRedirect("list.jsp");
    }
%>
</body>
</html>