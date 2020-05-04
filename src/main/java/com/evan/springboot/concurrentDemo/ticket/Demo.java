package com.evan.springboot.concurrentDemo.ticket;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 10:02
 */
public class Demo {
    public static void main(String[] args) {
        ThreadTran threadTran = new ThreadTran();
        Thread t1 = new Thread(threadTran, "一号窗口");
        Thread t2 = new Thread(threadTran, "二二");
        t1.start();
        t2.start();
    }
}
