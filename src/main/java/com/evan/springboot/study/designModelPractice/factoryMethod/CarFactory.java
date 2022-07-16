package com.evan.springboot.study.designModelPractice.factoryMethod;

import com.evan.springboot.study.designModelPractice.Car;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 14:32
 */
public interface CarFactory {
    public Car createCar();
}
