package com.evan.springboot.study.designModelPractice;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 14:11
 */
public class Client01 {
    public static void main(String[] args) {
        Car aodi=CarFactory.createCar("aodi");
        Car bmw = CarFactory.createCar("bmw");
        aodi.run();
        bmw.run();
    }
}
