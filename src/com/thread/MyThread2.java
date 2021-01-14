package com.thread;

/**
 * @author wangdaye996
 * @Date 2021/1/13
 * @Time 17:08
 *
 * 创建多线程的方式二:实现Runnable接口
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法:run()
 * 3.创建实现类的对象
 * 4．将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5．通过Thread类的对象调用start()
 *
 * 比较创建线程的两种方式:
 * 开发中:优先选择:实现Runnable接口的方式原因:
 *                      1．实现的方式没有类的单继承性的局限性
 *                      2．实现的方式更适合来处理多个线程有共享数据的情况。
 *
 * 联系: public class Thread implements Runnable
 * 相同点:两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
 */
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

class MyThread2_2{
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        new Thread(myThread2).start();
    }
}
