package com.evan.springboot.designModel.factory.abstractFactory;

import com.evan.springboot.designModel.factory.Car;
import com.evan.springboot.designModel.factory.funcFactory.Factory;
import com.evan.springboot.designModel.factory.simpleFactory.AuDiCar;

public class AuDiFactory extends AbstractFactory {
    @Override
    //业务逻辑
    public Car getCar() {
        return new AuDiCar();
    }
}
