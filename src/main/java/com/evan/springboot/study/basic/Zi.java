package com.evan.springboot.study.basic;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/17/2019 16:27
 */
public class Zi extends Fu {
    int num=20;
    public void method(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public void demo(){
        System.out.println("子");
    }
}
