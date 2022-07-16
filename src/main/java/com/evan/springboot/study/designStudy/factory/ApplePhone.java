package com.evan.springboot.study.designStudy.factory;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 下午 2:04
 */
public class ApplePhone implements Phone {
    @Override
    public void feature() {
        System.out.println("值得卖肾的手机，带有洗脑功能");
    }
}
