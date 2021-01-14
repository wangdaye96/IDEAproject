package com.controller;

import com.pojo.Goods;
import com.service.GoodsService;
import com.service.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author wangdaye996
 * @Date 2021/1/13
 * @Time 16:10
 */
@WebServlet(urlPatterns = {"/goods"})
public class GoodsServlet extends HttpServlet {
    GoodsService goodsService = new GoodsServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cmd = request.getParameter("cmd");
        if ("list".equals(cmd)){
            List<Goods> list=goodsService.Query();
            request.setAttribute("list",list);
            request.getRequestDispatcher("list.jsp").forward(request,response);
        }

        if ("del".equals(cmd)){
            String name = request.getParameter("name");
            Goods goods = new Goods(name);
            goodsService.DeleteByName(goods);
            response.sendRedirect("goods?cmd=list");
        }

        if ("edit".equals(cmd)){
            String modify = request.getParameter("modify");
            String id = request.getParameter("id");
            id=id==null?"0":id;
            //调用service，通过id查询商品详情
            Goods goods = goodsService.QueryById(Integer.parseInt(id));
            //设置本网页作用域
            request.setAttribute("goods",goods);
            request.setAttribute("modify",modify);
            //转发
            request.getRequestDispatcher("edit.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
        String modify = request.getParameter("modify");
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        Goods goods = new Goods(name,price);
        GoodsService goodsService = new GoodsServiceImpl();
        if ("1".equals(modify)) {
            goodsService.UpdateByName(goods);
        }else {
            goodsService.insert(goods);
        }
        response.sendRedirect("goods?cmd=list");
    }
}
