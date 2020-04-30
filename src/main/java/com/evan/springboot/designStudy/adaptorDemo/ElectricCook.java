package com.evan.springboot.designStudy.adaptorDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/30 下午 3:02
 */
public class ElectricCook {

    private Power110V power110V;
    public ElectricCook(Power110V power110V){
        this.power110V=power110V;
    }

    public void cook(){
        //连接电源
        power110V.connect();
        System.out.println("电饭煲开始煮饭啦。。。。");
    }
}
