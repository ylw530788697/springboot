package com.evan.springboot.designModel.factory.simpleFactory;

import com.evan.springboot.designModel.factory.Car;

public class SimpleFactoryTest {
    public static void main(String[] args) {

        SimpleFactoryCar simpleFactoryCar = new SimpleFactoryCar();
        Car car = simpleFactoryCar.getCar("BMW");
        System.out.println(car.getName());

    }
}
