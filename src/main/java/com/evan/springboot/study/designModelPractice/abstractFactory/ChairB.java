package com.evan.springboot.study.designModelPractice.abstractFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 15:30
 */
public class ChairB implements Chair {
    @Override
    public void run() {
        System.out.println("真皮，舒适");
    }
}
