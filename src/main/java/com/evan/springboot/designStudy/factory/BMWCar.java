package com.evan.springboot.designStudy.factory;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/24 下午 5:23
 */
public class BMWCar implements Car{
    @Override
    public void run() {
        System.out.println("BMW 车车跑的快快得");
    }
}
