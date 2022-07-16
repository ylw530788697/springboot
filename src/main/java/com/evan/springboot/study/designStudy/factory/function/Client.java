package com.evan.springboot.study.designStudy.factory.function;

import com.evan.springboot.study.designStudy.factory.sampleFactory.Car;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:02
 */
public class Client {
    public static void main(String[] args) {
        Car car = new BMWFactory().creatCar();
        car.run();

        Car car1 = new BenZFactory().creatCar();
        car1.run();
    }
}
