package com.evan.springboot.designModel.factory.abstractFactory;

import com.evan.springboot.designModel.factory.Car;

public class DefautFactory extends AbstractFactory{
    private AuDiFactory defaultFactory=new AuDiFactory();
    @Override
    Car getCar() {
        return defaultFactory.getCar();
    }
}
