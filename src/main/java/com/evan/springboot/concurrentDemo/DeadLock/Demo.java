package com.evan.springboot.concurrentDemo.DeadLock;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 10:21
 */
public class Demo {
    public static void main(String[] args) {
        LeftRightDeadLock leftRightDeadLock = new LeftRightDeadLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    leftRightDeadLock.leftRight();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    leftRightDeadLock.rightLeft();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
