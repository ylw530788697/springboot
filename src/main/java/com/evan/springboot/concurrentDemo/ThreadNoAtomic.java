package com.evan.springboot.concurrentDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 11:35
 */
public class ThreadNoAtomic extends Thread {
    private static volatile int count;

    private  static void addCount(){
        for (int i = 0; i < 1000; i++) {
            count++;
        }
        System.out.println(count);
    }

    @Override
    public void run() {
        addCount();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ThreadNoAtomic().start();
        }
    }
}
