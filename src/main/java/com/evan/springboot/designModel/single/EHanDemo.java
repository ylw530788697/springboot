package com.evan.springboot.designModel.single;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/19/2019 18:45
 */
public class EHanDemo {
    private EHanDemo(){}

    private static EHanDemo eHanDemo=new EHanDemo();

    public static EHanDemo getInstance(){
        return eHanDemo;
    }

    public static void main(String[] args) {
        EHanDemo instance = EHanDemo.getInstance();
        EHanDemo instance1 = EHanDemo.getInstance();
        System.out.println(instance == instance1);
    }
}
