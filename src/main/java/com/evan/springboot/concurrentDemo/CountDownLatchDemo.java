package com.evan.springboot.concurrentDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/13 下午 5:29
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
       /* ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            Runnable runnable = new Runnable(){
                @Override
                public void run() {
                    try {
                        System.out.println("子线程"+Thread.currentThread().getName()+"开始执行");
                        Thread.sleep(1000);
                        System.out.println("子线程"+Thread.currentThread().getName()+"子线程执行完成");
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            executorService.execute(runnable);
        }
        try {
            System.out.println("主线程"+Thread.currentThread().getName()+"等待子线程执行完毕");
            countDownLatch.await();
            System.out.println("主线程"+Thread.currentThread().getName()+"开始执行");
        }catch (Exception e){
            e.printStackTrace();
        }*/
        runDemo();
    }


    public static void runDemo(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch latchBegin = new CountDownLatch(1);
        CountDownLatch latchEnd = new CountDownLatch(4);
        for (int i = 0; i < 4; i++) {
            Runnable runnable = new Runnable(){
                @Override
                public void run() {
                    try {
                        System.out.println("子线程"+Thread.currentThread().getName()+"等待裁判");
                        latchBegin.await();
                        System.out.println("子线程"+Thread.currentThread().getName()+"赛前准备");
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("选手" + Thread.currentThread().getName() + "到达终点");
                        latchEnd.countDown();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            };
            executorService.execute(runnable);
        }

        try {
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println("裁判到场"+ Thread.currentThread().getName());
            latchBegin.countDown();
            System.out.println("裁判"+Thread.currentThread().getName()+"已发送口令，正在等待所有选手到达终点");
            latchEnd.await();
            System.out.println("所有选手都到达终点");
            System.out.println("裁判"+Thread.currentThread().getName()+"汇总成绩排名");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
