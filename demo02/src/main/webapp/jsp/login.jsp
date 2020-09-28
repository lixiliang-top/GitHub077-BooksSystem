<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/9/24
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/statics/js/jquery-1.12.4.js"></script>
</head>
<body>
<center>
    <form action="/doLogin" method="post">
        <table border="1px">
            <tr align="center" >
                <td colspan="2" style="height:30px;"><h2 style="line-height: 30px">图书借阅系统</h2></td>
            </tr>
            <tr>
                <td align="center">登录账号：</td>
                <td><input type="text" name="user_code"></td>
            </tr>
            <tr>
                <td align="center">登陆密码：</td>
                <td><input type="text" name="password"></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="登陆"></td>
            </tr>
            <tr align="center">
                <td colspan="2"><span id="error" style="color: red">${error}</span></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
