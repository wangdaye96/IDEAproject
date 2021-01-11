<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/5
  Time: 12:29
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>王大大网站</title>
</head>
<body>
<h1 style="color: #ff0a10">JSP语法</h1>
<%!
    //声明变量和定义方法
    String name2 = "傲天";

    public int add(int x, int y) {
        return x + y;
    }
%>
<%
    //写非方法的Java代码
    String name = "夜夜笙歌";
    System.out.println(name);
    //JSP内置输出对象 out.print/response.getWriter
    PrintWriter out2 = response.getWriter();
    out2.print("out2-" + name);

    out.print("out1-" + name + "<br/>");
    out.print("<h3>" + name2 + "<h3/><br/>");
    out.print(add(1, 1));
%>
<br/>
<%=
//等价于输出
        name
%><br/>
<%=
add(2, 3)
%><br/>
<h3>表单数据收集</h3>
<a href="list.jsp">商品信息管理</a>
<form action="show.jsp" method="post">
    编号：<input type="text" name="empno" value=" "><br/>
    姓名：<input type="text" id="ename" name="ename" maxlength="5" size="20"><br>

    性别:<input type="radio" name="sex" value="男" checked="checked">男
    <input type="radio" name="sex" value="女">女<br/>
    学历:
    <select name="select">
        <option value="本科">本科</option>
        <option value="专科" selected="selected">专科</option>
    </select><br/>
    选修:<br/>
    <input type="checkbox" name="course" value="JS" checked="checked">js
    <input type="checkbox" name="course" value="CSS">CSS
    <input type="checkbox" name="course" value="DIV">DIV<br/>
    <input type="checkbox" name="course" value="spring">spring<br/>
    <br/>
    自我评价: <br/>
    <textarea rows="4" cols="30" name="my"
    >感觉不错</textarea><br/>
    <br/>
    <input type="submit"> <br/>
</form>
</body>
</html>
