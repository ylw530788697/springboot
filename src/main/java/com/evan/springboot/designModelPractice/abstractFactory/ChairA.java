package com.evan.springboot.designModelPractice.abstractFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 15:30
 */
public class ChairA implements Chair {
    @Override
    public void run() {
        System.out.println("可以自动加热");
    }
}
