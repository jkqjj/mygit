<%--
  Created by IntelliJ IDEA.
  User: jiajiaQian
  Date: 2016/11/21
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据库管理员</title>
</head>
<body>
<center>
    <h1>管理员注册表单</h1><hr><br>
    <form action="user_action.jsp" method="post">
        <table width="80%">
            <tr>
                <td colspan="2">用户登录</td>
            </tr>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="注册">
                    <input type="reset" value="重置">
                    <a href="login.jsp">返回主界面</a>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
