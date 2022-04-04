package com.evan.springboot.concurrentDemo.communication;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/04 09:56
 */
public class Client {
    public static void main(String[] args) {
        Res res = new Res();
        IntThread intThread = new IntThread(res);
        OoutThread ooutThread = new OoutThread(res);
        intThread.start();
        ooutThread.start();
    }
}
