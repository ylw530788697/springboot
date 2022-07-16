package com.evan.springboot.study.designModelPractice;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 14:04
 */
public class AoDiCar implements Car {
    @Override
    public void run() {
        System.out.println("奥迪汽车在跑");
    }
}
