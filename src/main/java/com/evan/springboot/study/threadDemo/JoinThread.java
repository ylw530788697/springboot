package com.evan.springboot.study.threadDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/02 22:13
 */
public class JoinThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----i:"+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
