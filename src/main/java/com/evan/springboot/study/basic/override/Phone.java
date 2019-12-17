package com.evan.springboot.study.basic.override;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/17/2019 16:47
 */
public class Phone {
    public void send(){
        System.out.println("发短信");
    }
    public void show(){
        System.out.println("显示来电");
    }

    public void call(){
        System.out.println("打电话");
    }
}
