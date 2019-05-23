package com.evan.springboot.designModel.factory.abstractFactory;

import com.evan.springboot.designModel.factory.Car;
import com.evan.springboot.designModel.factory.simpleFactory.AuDiCar;
import com.evan.springboot.designModel.factory.simpleFactory.BMWCar;

public abstract  class AbstractFactory {
    abstract Car getCar();

    //动态配置
    public Car getCar(String name){
        if ("BMW".equalsIgnoreCase(name)){
            return  new AuDiFactory().getCar();
        }else if("AuDI".equalsIgnoreCase(name)){
            return  new BMWFactory().getCar();
        }
        return  null;
    }
}
