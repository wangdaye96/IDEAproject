<%@ page import="com.pojo.Goods" %><%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/11
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String name=request.getParameter("name");
    out.print(name);
%>
<form action="edit2.jsp?name=<%=name%>" method="post">
    你想修改的价格:<input name="price" type="text"/><br>
    <input type="submit" value="修改"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>
