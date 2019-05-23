package com.evan.springboot.designModel.factory.simpleFactory;

import com.evan.springboot.designModel.factory.Car;

public class AuDiCar implements Car {
    @Override
    public String getName() {
        return "Audi";
    }
}
