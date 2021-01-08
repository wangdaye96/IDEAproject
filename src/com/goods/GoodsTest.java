package com.goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangdaye996
 * @createtime 2021/1/6 - 20:07
 */
//商品增删改查
public class GoodsTest {
    public static void main(String[] args) {
        ArrayList<Goods> list = new ArrayList<>();
        list.add(0,new Goods(1, "香蕉", 3.2));
        list.add(1,new Goods(2, "苹果", 6.5));
        list.add(2,new Goods(3, "橙子", 4.0));
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
                    toStringGoods(list);
                    break;
                case 2:
                    addGood(list);
                    break;
                case 3:
                    editGood(list);
                    break;
                case 4:
                    deleteGood(list);
                    break;
                case 5:
                    menu = 5;
                    break;
                default:
                    System.out.println("输入错误，请重新输入:");
            }
        }
    }

    public static void toStringGoods(List list){
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    public static void addGood(List list){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入商品名称:");
        String name=input.nextLine();
        System.out.println("请输入商品序列号:");
        int id=input.nextInt();
        System.out.println("请输入商品价格:");
        double price=input.nextDouble();
        Goods good=new Goods();
        good.setId(id);
        good.setName(name);
        good.setPrice(price);
        list.add(id-1,good);
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    public static void editGood(List list){
        Scanner input = new Scanner(System.in);
        System.out.println("输入你想修改商品的名字:");
        String name=input.nextLine();
        System.out.println("请输入商品序列号:");
        int id=input.nextInt();
        System.out.println("请输入价格:");
        double price=input.nextDouble();
        list.set(id-1,new Goods(id,name,price));
        System.out.println("修改完成");
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }

    public static void deleteGood(List list){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要删除商品的序列号:");
        int id=input.nextInt();
        list.remove(id-1);
        System.out.println("删除成功");
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}

