package com.ordertest;

/**
 * @author wangdaye996
 * @createtime 2021/1/6 - 15:54
 */
//重写object类中equals()方法测试
public class OrderTest {
    public static void main(String[] args) {
        Order order1=new Order(1,"哈哈");
        Order order2=new Order(1,"哈哈");
        System.out.print(order1.equals(order2));
    }

}
