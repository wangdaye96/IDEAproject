<%@ page import="com.service.GoodsService" %>
<%@ page import="com.service.GoodsServiceImpl" %>
<%@ page import="com.pojo.Goods" %>
<%@ page import="static java.lang.Double.valueOf" %><%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/11
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增页面</title>
</head>
<body>
<form action="add2.jsp" method="post">
        名称:<input id="name" name="name" type="text"/><br>
        价格:<input name="price" type="text"/><br>
        <input type="submit" value="添加"/>
        <input type="reset" value="重置"/>
</form>
</body>
</html>
