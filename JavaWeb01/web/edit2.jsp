<%@ page import="static java.lang.Double.valueOf" %>
<%@ page import="com.pojo.Goods" %>
<%@ page import="com.service.GoodsService" %>
<%@ page import="com.service.GoodsServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/11
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理edit数据页面</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    Double price = valueOf(request.getParameter("price"));
    Goods goods = new Goods(name,price);
    GoodsService goodsService = new GoodsServiceImpl();
    goodsService.UpdateByName(goods);
    response.sendRedirect("list.jsp");
%>
</body>
</html>
