package com.evan.springboot.designModelPractice.abstractFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/21/2019 10:04
 */
public class BmwCar implements  CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Chair createChair() {
        return new ChairB();
    }
}
