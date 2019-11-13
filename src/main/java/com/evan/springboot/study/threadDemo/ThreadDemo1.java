package com.evan.springboot.study.threadDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/11/13 20:56
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        createThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
        impleThread impleThread = new impleThread();
        Thread thread=new Thread(impleThread);
        thread.start();
    }
}

class CreateThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

class  impleThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ "   "+  i);
        }
    }
}