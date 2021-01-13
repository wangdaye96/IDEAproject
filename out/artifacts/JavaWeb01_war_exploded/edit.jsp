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
    /*request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    name=name==null?"":name;
    String price = request.getParameter("price");
    price=price==null?"":price;*/
    /*String id = request.getParameter("id");
    id=id==null?"0":id;
    //调用service，通过id查询商品详情
    GoodsService goodsService = new GoodsServiceImpl();
    Goods goods = goodsService.QueryById(Integer.parseInt(id));
    //设置本网页作用域
    pageContext.setAttribute("goods",goods);
    String modify = request.getParameter("modify");*/
%>
<form action="goods?modify=${param.modify}" method="post">
        名称:<input name="name" type="text" value="${goods.name}"/><br>
        价格:<input name="price" type="text" value="${goods.price==0.0?"":goods.price}"/><br>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
</form>
</body>
</html>
