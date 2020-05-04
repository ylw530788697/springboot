package com.evan.springboot.concurrentDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 11:28
 */
public class ThreadVolatitleDemo extends Thread {

    public boolean flag=true;
    @Override
    public void run(){
        System.out.println("开始执行子线程");
        while (flag){

        }
        System.out.println("线程停止");
    }

    public void setRunging (boolean flag){
        this.flag=flag;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadVolatitleDemo demo = new ThreadVolatitleDemo();
        demo.start();
        Thread.sleep(3000);
        demo.setRunging(false);
        System.out.println("flag 已经设置成false");
        Thread.sleep(1000);
        System.out.println(demo.flag);

    }
}
