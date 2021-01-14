package com.thread;

/**
 * @author wangdaye996
 * @Date 2021/1/12
 * @Time 14:13
 *
 * 多线程的创建，方式一:继承Thread类
 *  * 1、创建一个继承于Thread类的子类
 *  * 2、重写Thread类的run()
 *  * 3、创建实例
 *  * 4、调用start()
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class MyThread1_2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}