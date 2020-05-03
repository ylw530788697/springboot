package com.evan.springboot.study.threadDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/02 22:14
 */
public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        Thread t1 = new Thread(joinThread);
        Thread t2 = new Thread(joinThread);
        t1.start();
        t2.start();
        t1.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----i:" + i);
            Thread.sleep(200);
        }

    }
}
