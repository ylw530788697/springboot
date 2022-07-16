package com.evan.springboot.study.designStudy.factory.abstractFactor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:37
 */
public class EngineB implements Engine {
    @Override
    public void run() {
        System.out.println("转速慢");
    }

    @Override
    public void start() {
        System.out.println("启动比较慢，马力大");
    }
}
