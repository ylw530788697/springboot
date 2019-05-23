package com.evan.springboot.designModel.factory.funcFactory;

import com.evan.springboot.designModel.factory.Car;
import com.evan.springboot.designModel.factory.simpleFactory.AuDiCar;

public class AuDiFactory implements  Factory {
    @Override
    public Car getCar() {
        return new AuDiCar();
    }
}
