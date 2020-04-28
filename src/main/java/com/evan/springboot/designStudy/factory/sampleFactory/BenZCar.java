package com.evan.springboot.designStudy.factory.sampleFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/24 下午 5:30
 */
public class BenZCar implements Car {
    @Override
    public void run() {
        System.out.println("大奔就是快");
    }
}
