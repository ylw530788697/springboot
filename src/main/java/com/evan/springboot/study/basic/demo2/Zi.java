package com.evan.springboot.study.basic.demo2;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/17/2019 17:41
 */
public class Zi extends Fu {
    int num=20;

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void show(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
