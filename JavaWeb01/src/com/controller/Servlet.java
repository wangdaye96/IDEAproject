package com.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangdaye996
 * @Date 2021/1/13
 * @Time 15:31
 */
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            response.sendRedirect("hello.jsp");
        request.setAttribute("name","黄鸡");
        request.getRequestDispatcher("hello.jsp").forward(request,response);
    }
}
