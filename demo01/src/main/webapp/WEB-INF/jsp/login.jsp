<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/9/28
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="am-u-sm-10 login-am-center">
    <form class="am-form" action="/doLogin" method="post">
        <fieldset>
            <div class="am-form-group">
                <input type="text" name="usercode" class="" id="doc-ipt-email-1" placeholder="请输入管理员姓名">
            </div>
            <div class="am-form-group">
                <input type="password" name="password" class="" id="doc-ipt-pwd-1" placeholder="管理员密码">
            </div>
            <span>${error }</span>
            <p><button type="submit" class="am-btn am-btn-default">登录</button></p>
        </fieldset>
    </form>
</div>

</body>
</html>
