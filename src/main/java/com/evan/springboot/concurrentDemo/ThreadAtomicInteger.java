package com.evan.springboot.concurrentDemo;

import sun.java2d.pipe.SpanIterator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 11:40
 */
public class ThreadAtomicInteger extends Thread {

    private static AtomicInteger atomicInteger=new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            atomicInteger.incrementAndGet();
        }
        System.out.println(atomicInteger.get());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ThreadAtomicInteger().start();
        }
    }
}
