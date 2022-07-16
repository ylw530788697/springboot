package com.evan.springboot.study.designStudy.factory.abstractFactor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:43
 */
public class BenzCar implements CarFInterface{
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Chair createChair() {
        return new ZhenPiChair();
    }
}
