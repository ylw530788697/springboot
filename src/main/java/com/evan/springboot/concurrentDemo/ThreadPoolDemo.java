package com.evan.springboot.concurrentDemo;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/02 10:58
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ThreadPoolDemo threadPoolDemo = new ThreadPoolDemo();
        threadPoolDemo.policyDemo();

    }
    public void policyDemo(){
        int corePoolSize=5;
        int maxPoolSize=10;
        long keepAliveTime=5;
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(10);
        //RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
        RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.SECONDS, queue, handler);
        for (int i = 0; i < 100; i++) {
            executor.execute(()->{
                try {
                    System.out.println(Thread.currentThread().getName()+" queue size: "+queue.size());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }
    }

    public void catchDemo(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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
                    System.out.println(System.currentTimeMillis());
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
