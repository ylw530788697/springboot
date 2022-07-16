package com.evan.springboot.study.designStudy.factory.abstractFactor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:44
 */
public class Client {
    public static void main(String[] args) {
        CarFInterface benzCar = new BenzCar();
        Chair chair = benzCar.createChair();
        Engine engine = benzCar.createEngine();

    }
}
