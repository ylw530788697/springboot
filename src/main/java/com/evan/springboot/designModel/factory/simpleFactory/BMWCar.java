package com.evan.springboot.designModel.factory.simpleFactory;

import com.evan.springboot.designModel.factory.Car;

public class BMWCar implements Car {
    @Override
    public String getName() {
        return "BWM";
    }
}
