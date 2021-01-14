package com.thread;

/**
 * @author wangdaye996
 * @Date 2021/1/13
 * @Time 16:54
 *
 * /多窗口卖票
 *
 * 方式一:同步代码块
 * synchronized(同步监视器){
 *  * //需要被同步的代码
 *  * }
 * 说明:1.操作共享数据的代码，即为需要被同步的代码 -->不能包含代码多了，也不能包含代码少了。
 *     2.共享数据:多个线程共同操作的变量。比如: ticket就是共享数据。
 *     3.同步监视器，俗称:锁。任何一个类的对象，都可以充当锁。
 *       补充:在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器。
 *       说明:在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类(类名.class)充当同步监视器
 *
 *
 * 方式二:同步方法
 *
 *
 *
 *     5.同步的方式，解决了线程的安全问题。---好处
 *       操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。---坏处
 */
public class TicketTest implements Runnable{
    private static int ticket=100;
//    Object obj=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (this) {//this为TicketTest类当前对象 方式二:synchronied(obj)
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票" + "票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        TicketTest t=new TicketTest();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
