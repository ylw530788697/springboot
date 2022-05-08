package com.evan.springboot.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/04/23 16:32
 */
public class MyCacheThreadPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            int tem=i;
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("threadName;"+Thread.currentThread().getName()+",i"+tem);
                }
            });
        }
    }
}
