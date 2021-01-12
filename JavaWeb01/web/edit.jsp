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
    <title>编辑页面</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    name=name==null?"":name;
    String price = request.getParameter("price");
    price=price==null?"":price;
    String modify = request.getParameter("modify");
%>
<form action="do.jsp?modify=${param.modify}" method="post">
        名称:<input name="name" type="text" value="${param.name}"/><br>
        价格:<input name="price" type="text" value="${param.price}"/><br>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
</form>
</body>
</html>
