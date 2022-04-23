package com.evan.springboot.study.thread;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/04/23 09:55
 */
public class MyThread extends Thread {

    public void run(){

        System.out.println(this.getName()+" this is my thread");
    }

    public static void main(String[] args) {
        System.out.println("this is main");
        for (int i = 0; i < 50; i++) {
            MyThread myThread = new MyThread();
            myThread.run();
        }

    }
}
