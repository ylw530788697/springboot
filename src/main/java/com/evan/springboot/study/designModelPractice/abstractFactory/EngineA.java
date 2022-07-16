package com.evan.springboot.study.designModelPractice.abstractFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 15:09
 */
public class EngineA implements Engine {
    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快，自动挡");
    }
}
