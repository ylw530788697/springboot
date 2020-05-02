package com.evan.springboot.study.concurrentDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/02 10:58
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ThreadPoolDemo threadPoolDemo = new ThreadPoolDemo();
        threadPoolDemo.singleDemo();

    }

    public void catchDemo(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+ "  :"+finalI);
                }
            });
        }
    }

    public void fixedDemo(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+ "  :"+finalI);
                }
            });
        }
    }

    public void scheduleDemo(){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            executorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+ "  :"+finalI);
                }
            },3,TimeUnit.SECONDS);
        }

    }

    public void singleDemo(){
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+ "  :"+finalI);
                }
            });
        }

    }
}
