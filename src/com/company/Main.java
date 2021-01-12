package com.company;

public class  Main {
    public static void main(String[] args) {
        Interface1 a = new InterfaceTest();
        //通过实现类的对象，可以调用接口中的默认方法
        a.method2();
        a.method3();
        //接口中定义的方法只能通过接口调用
        Interface1.method1();
        //如果子类（或实现类）继承的父类和实现的接口中声明了同名同参数的方法
        //那么在子类没有重写此方法的情况下，默认调用的是父类中的方法-->类优先原则

    }
}
