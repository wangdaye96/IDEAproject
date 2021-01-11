<%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2021/1/11
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单数据</title>
</head>
<body>
    <h3>表单数据收集-1</h3>
    <%
        //request 可以收集表单数据
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
        //跳转方案一：转发 地址不改变,参数继续传递
//        request.getRequestDispatcher("show2.jsp").forward(request,response);
        //跳转方案二：重定向 地址改变，参数不能传递
        response.sendRedirect("show2.jsp");
    %>
</body>
</html>
