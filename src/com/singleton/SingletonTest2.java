package com.singleton;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 18:25
 * 单例模式-懒汉式的实现
 */
public class SingletonTest2 {
    private Order order2;

    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}

class Order {

    //1、私有化构造器
    private Order() {

    }

    //2、声明类的对象，但不初始化
    //4、此对象必须声明为static
    private static Order order = null;

    //3、声明公共静态方法返回类对象
    public static Order getInstance() {
        if (order == null) {
            order = new Order();
        }
        return order;
    }
}