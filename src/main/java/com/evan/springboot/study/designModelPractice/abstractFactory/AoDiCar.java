package com.evan.springboot.study.designModelPractice.abstractFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/21/2019 10:03
 */
public class AoDiCar implements  CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Chair createChair() {
        return new ChairA();
    }
}
