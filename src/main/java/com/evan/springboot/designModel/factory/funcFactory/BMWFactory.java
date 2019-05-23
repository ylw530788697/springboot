package com.evan.springboot.designModel.factory.funcFactory;

import com.evan.springboot.designModel.factory.Car;
import com.evan.springboot.designModel.factory.simpleFactory.BMWCar;

public class BMWFactory implements  Factory {
    @Override
    public Car getCar() {
        return new BMWCar();
    }
}
