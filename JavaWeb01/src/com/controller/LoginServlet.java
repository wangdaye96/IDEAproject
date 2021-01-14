package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author wangdaye996
 * @Date 2021/1/14
 * @Time 15:09
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //用户名必须包含admin，登录成功，用户信息存入sessioin作用域
        String name = request.getParameter("name");
        if (name.contains("admin")){
            HttpSession session = request.getSession();
            session.setAttribute("user",name);
            //session有效时间
            //session.setMaxInactiveInterval(10);//单位秒
            response.sendRedirect("index.jsp");
        }else {
            response.sendRedirect("login.jsp");
        }
    }
}
