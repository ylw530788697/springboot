package com.evan.springboot.study.thread;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/04/23 10:01
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 实现runable");
    }

    public static void main(String[] args) {
        System.out.println("main is starting");
        for (int i = 0; i < 10; i++) {
            MyRunable myRunable = new MyRunable();
            Thread thread = new Thread(myRunable);
            thread.start();
        }
    }
}
