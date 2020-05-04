package com.evan.springboot.concurrentDemo.ticket;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 10:01
 */
public class ThreadTran implements Runnable {
    private int count=100;
    private static Object object=new Object();
    @Override
    public void run() {
        while (count>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }

    public void sale(){
        if (count>0) {
            synchronized (object) {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + ",正在出售第" + (100 - count + 1));
                    count--;
                }
            }
        }
    }
}
