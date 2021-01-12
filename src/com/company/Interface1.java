package com.company;

/**
 * @author wangdaye996
 * @createtime 2021/1/11 - 20:46
 */
public interface Interface1 {
    public static void method1(){
        System.out.println("Method1");
    }

    public default void method2(){
        System.out.println("Method2");
    }
    default void method3(){
        System.out.println("Method3");
    }
}
