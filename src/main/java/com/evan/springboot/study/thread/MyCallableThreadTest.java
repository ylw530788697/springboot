package com.evan.springboot.study.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/04/23 10:08
 */
public class MyCallableThreadTest implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ i);
        }
        return "return";
    }

    public static void main(String[] args) {
        MyCallableThreadTest myCallableThreadTest = new MyCallableThreadTest();
        FutureTask futureTask = new FutureTask<>(myCallableThreadTest);
        new Thread(futureTask,"this is mycallable").start();
        try {
            Object o = futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
