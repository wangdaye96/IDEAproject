<%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/11
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>第二个结果页面</h1>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String empno = request.getParameter("empno");
    String ename = request.getParameter("ename");
    String sex = request.getParameter("sex");
    String select = request.getParameter("select");
    String my = request.getParameter("my");
    out.print(empno+"<br>");
    out.print(ename+"<br>");
    out.print(sex+"<br>");
    out.print(select+"<br>");
    out.print(my+"<br>");
    String[] courses = request.getParameterValues("course");
    if (courses!=null) {
        for (String c : courses) {
            out.print(c + "<br>");
        }
    }
%>
</body>

</html>
