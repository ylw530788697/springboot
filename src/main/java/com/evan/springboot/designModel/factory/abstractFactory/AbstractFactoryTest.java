package com.evan.springboot.designModel.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        DefautFactory factory=new DefautFactory();
        System.out.println(factory.getCar());
    }
}
