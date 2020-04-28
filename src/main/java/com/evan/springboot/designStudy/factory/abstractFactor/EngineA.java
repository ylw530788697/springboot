package com.evan.springboot.designStudy.factory.abstractFactor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:34
 */
public class EngineA implements Engine {

    @Override
    public void run() {
        System.out.println("转速快，马力小");
    }

    @Override
    public void start() {
        System.out.println("启动快，动力小");
    }
}
