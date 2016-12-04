<%--
  Created by IntelliJ IDEA.
  User: qianjiajia
  Date: 2016/11/15
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
<c:forEach end="14" begin="0" step="1">
    欢迎你${user.userName}
</c:forEach>
</body>
</html>
