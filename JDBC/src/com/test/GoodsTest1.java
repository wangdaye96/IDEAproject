package com.test;

import com.pojo.Goods;
import com.service.GoodsService;
import com.service.GoodsServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangdaye996
 * @createtime 2021/1/9 - 0:12
 */
public class GoodsTest1 {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        GoodsService goodsService = new GoodsServiceImpl();
        int menu = 0;
        while (menu != 5) {
            System.out.println("*****商品管理列表*****");
            System.out.println("*****1、商品查询*****");
            System.out.println("*****2、商品新增*****");
            System.out.println("*****3、商品修改*****");
            System.out.println("*****4、商品删除*****");
            System.out.println("*****5、系统退出*****");
            System.out.println("*******************");
            System.out.println("请输入菜单号:");
            Scanner input = new Scanner(System.in);
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    list=goodsService.Query();
                    for (Goods goods : list) {
                        System.out.println(goods);
                    }
                    break;
                case 2:
                    System.out.println("请输入添加商品的名字:");
                    String name=input.next();
                    System.out.println("请输入商品价格:");
                    double price=input.nextDouble();
                    Goods goods=new Goods(name,price);
                    goodsService.insert(goods);
                    break;
                case 3:
                    System.out.println("请输入需要商品的名字:");
                    String name1=input.next();
                    System.out.println("请输入修改的价格:");
                    double price1=input.nextDouble();
                    Goods goods1=new Goods(name1,price1);
                    goodsService.UpdateByName(goods1);
                    break;
                case 4:
                    System.out.println("请输入需要删除商品的名字:");
                    String name2=input.next();
                    Goods goods2=new Goods(name2);
                    goodsService.DeleteByName(goods2);
                    break;
                case 5:
                    menu = 5;
                    break;
                default:
                    System.out.println("输入错误，请重新输入:");
            }
        }
    }
}
