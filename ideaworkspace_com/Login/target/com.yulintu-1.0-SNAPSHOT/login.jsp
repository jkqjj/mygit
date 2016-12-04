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
<form action="/login" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="登录">

</form>
</body>
</html>