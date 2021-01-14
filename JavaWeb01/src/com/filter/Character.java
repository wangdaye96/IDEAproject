package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author wangdaye996
 * @Date 2021/1/14
 * @Time 14:09
 */
//@WebFilter(urlPatterns = {"/*"})
@WebFilter("/*")
public class Character implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //统一设置字符集
        //从前端到后端
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");

        //从后端到前端
        servletResponse.setContentType("text/html;charset=utf-8");

        //正常放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
