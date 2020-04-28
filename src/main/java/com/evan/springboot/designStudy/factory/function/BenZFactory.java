package com.evan.springboot.designStudy.factory.function;


import com.evan.springboot.designStudy.factory.sampleFactory.BenZCar;
import com.evan.springboot.designStudy.factory.sampleFactory.Car;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:01
 */
public class BenZFactory implements CarFactory {
    @Override
    public Car creatCar() {
        return new BenZCar();
    }
}
