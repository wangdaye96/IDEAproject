package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdaye996
 * @Date 2021/1/14
 * @Time 14:52
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    private List<String> urls = new ArrayList<>();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        urls.add("login.jsp");
        urls.add("login");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //先获取当前请求的地址
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        for (String url : urls) {
            if (requestURI.contains(url)){
                filterChain.doFilter(servletRequest,servletResponse);
                return;
            }
        }
        HttpSession session = request.getSession();
        if (session.getAttribute("user")!=null){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
