package com.evan.springboot.study.designModelPractice.factoryMethod;

import com.evan.springboot.study.designModelPractice.Car;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 14:37
 */
public class Client02 {
    public static void main(String[] args) {
        Car car = new AodiCarFactory().createCar();
        Car bmw = new BmwCarFactory().createCar();
        car.run();
        bmw.run();
    }
}
