package com.thread;

/**
 * @author wangdaye996
 * @Date 2021/1/12
 * @Time 14:10
 */
public class ThreadTest {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        t1.start();//启动当前线程，调用当前线程的run()方法
//        MyThread2 t2=new MyThread2();
//        t2.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
