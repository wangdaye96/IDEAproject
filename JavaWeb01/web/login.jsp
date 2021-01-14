<%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/14
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>用户登录</h1>
<%--用户名包含admin，方可登录成功--%>
<form action="login" method="post">
    用户名:<input type="text" name="name"><br>
          <input type="submit" value="登录">
</form>
</body>
</html>
