package com.evan.springboot.study.designModelPractice;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 14:06
 */
public class CarFactory {
    public static Car createCar(String name){
        switch (name) {
            case "aodi":
                return new AoDiCar();
            case "bmw":
                return  new BMWCar();
        }
        return null;
    }
}
