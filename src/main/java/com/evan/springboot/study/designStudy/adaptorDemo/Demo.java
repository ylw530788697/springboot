package com.evan.springboot.study.designStudy.adaptorDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/30 下午 3:14
 */
public class Demo {
    public static void main(String[] args) {
        Power220V power220V = new Power220VImpl();
        PowerAdapter powerAdapter = new PowerAdapter(power220V);
        ElectricCook electricCook = new ElectricCook(powerAdapter);
        electricCook.cook();
    }
}
