<%@ page import="com.pojo.Goods" %>
<%@ page import="com.service.GoodsService" %>
<%@ page import="com.service.GoodsServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/11
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除页面</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
//    out.print(name);
//    out.print(price);
    Goods goods = new Goods(name);
    GoodsService goodsService = new GoodsServiceImpl();
    goodsService.DeleteByName(goods);
    response.sendRedirect("list.jsp");
%>
</body>
</html>
