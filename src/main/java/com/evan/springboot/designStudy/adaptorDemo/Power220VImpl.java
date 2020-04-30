package com.evan.springboot.designStudy.adaptorDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/30 下午 3:01
 */
public class Power220VImpl implements Power220V {
    @Override
    public void connect() {
        System.out.println("连接上220V的电源");
    }
}
