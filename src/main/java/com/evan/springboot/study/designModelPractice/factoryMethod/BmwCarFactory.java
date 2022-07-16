package com.evan.springboot.study.designModelPractice.factoryMethod;

import com.evan.springboot.study.designModelPractice.BMWCar;
import com.evan.springboot.study.designModelPractice.Car;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 14:36
 */
public class BmwCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMWCar();
    }
}
