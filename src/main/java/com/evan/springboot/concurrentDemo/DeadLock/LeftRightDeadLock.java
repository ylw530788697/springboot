package com.evan.springboot.concurrentDemo.DeadLock;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 10:19
 */
public class LeftRightDeadLock {
    private final static Object left=new Object();
    private final Object right=new Object();
    public boolean flag=true;


    public void leftRight() throws InterruptedException {
        synchronized (left){
            Thread.sleep(200);
            synchronized (right){
                Thread.sleep(60);
            }
        }
    }

    public void rightLeft() throws InterruptedException {
        synchronized (right){
            Thread.sleep(200);
            synchronized (left){
                Thread.sleep(60);
            }
        }
    }

}
