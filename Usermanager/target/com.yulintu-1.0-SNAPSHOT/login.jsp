<%--
  Created by IntelliJ IDEA.
  User: mocker
  Date: 16/11/14
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>数据库管理员</title>
    <script type="text/javascript">
        function check() {
            document.form1.action = "user.jsp";
            document.form1.submit();
        }
        function login() {
            document.form1.action = "login_conf.jsp";
            document.form1.submit();
        }
    </script>
</head>
<body>
<center>
    <h1>数据库管理员</h1><hr><br/>
    <%
        if(request.getAttribute("err") != null){
    %>
    <h2><%=request.getAttribute("err")%></h2>
    <%
        }
    %>
    <form name="form1" action="" method="post">
        <table width="80%">
            <tr>
                <td colspan="2">用户登陆</td>
            </tr>

            <tr>
                <td>用户名:</td>
                <td><input type="text" name="uname"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="upassword"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="button" onclick="login()" value="登录">
                    <input type="reset" value="重置">
                    <input type="button" onclick="check()" value="注册">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
