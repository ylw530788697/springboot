package com.evan.springboot.designModel.factory.funcFactory;

import com.evan.springboot.designModel.factory.Car;

public class FuncFactoryTest {

    public static void main(String[] args) {
        //工厂方法模式
        //各个产品的生产商，都拥有各自的工厂
        //生产工艺。生产的高科技程度都是不一样的
        Factory factory=new AuDiFactory();
        Car car = factory.getCar();
        System.out.println(car);
        System.out.println( factory.getCar().getName());
    }
}
