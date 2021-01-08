package com.singleton;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 18:17
 * 单例模式-饿汉式的实现-天然线程安全
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();
        System.out.println(bank1==bank2);
    }
}


//饿汉式
class Bank {
    //1、私有化构造器
    private Bank(){

    }

    //2、内部创建类的私有对象
    //3、此对象声明为静态的
    private static Bank bank=new Bank();

    //4、提供公共的静态方法返回对象
    public static Bank getInstance(){
        return bank;
    }
}
