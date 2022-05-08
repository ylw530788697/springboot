package com.evan.springboot.study.thread;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/04/23 16:37
 */
public class MySingleThreadPool {
    public static void main(String[] args) {
        ExecutorService sing = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index=i;
            sing.execute(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    System.out.println("index: "+index);
                    Thread.sleep(2000);
                }
            });
        }
    }
}
