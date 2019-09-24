package com.evan.springboot.designModelPractice.abstractFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/21/2019 10:19
 */
public class Client {
    public static void main(String[] args) {
        CarFactory aoDiCar = new AoDiCar();
        Engine engine = aoDiCar.createEngine();
        engine.run();
        engine.start();
    }
}
