package com.evan.springboot.study.designStudy.factory.sampleFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/24 下午 5:35
 */
public class CarFactory {
    public static Car getCar(String carName){
        Car car=null;
        if(carName.equals("BMW")){
            car=new BMWCar();
        }else if(carName.equals("BenZ")){
            car=new BenZCar();
        }
        return  car;

    }

    public static void main(String[] args) {
        Car bnw = getCar("BMW");
        bnw.run();
    }
}
