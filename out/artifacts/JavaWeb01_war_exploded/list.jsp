<%@ page import="com.service.GoodsService" %>
<%@ page import="com.service.GoodsServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.pojo.Goods" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/11
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品信管理</title>
</head>
<body>
<h1>商品信息管理</h1>
<%
    GoodsService goodsService = new GoodsServiceImpl();
    List<Goods> list=goodsService.Query();
    request.setAttribute("list",list);
%>
<a href="edit.jsp?modify=0">新增</a>
<table width="500px" border="1px" bgcolor="#d2691e">
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>价格</td>
        <td>操作</td>
    </tr>
<c:forEach items="${list}" var="goods" >
    <tr>
        <td>${goods.id}</td>
        <td>${goods.name}</td>
        <td>${goods.price}</td>
        <td><a href="edit.jsp?name=${goods.name}&price=${goods.price}&modify=1">修改</a>
            <a href="delete.jsp?name=${goods.name}" onclick="return confirm('是否删除')">删除</a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
