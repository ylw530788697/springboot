package com.evan.springboot.designModel.factory.simpleFactory;

import com.evan.springboot.designModel.factory.Car;

public class SimpleFactoryCar {

    public Car getCar(String name){
        if ("BMW".equalsIgnoreCase(name)){
            return  new BMWCar();
        }else if("AuDI".equalsIgnoreCase(name)){
            return  new AuDiCar();
        }
        return  null;
    }
}
