package com.evan.springboot.study.designStudy.factory;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 下午 2:07
 */
public class PhoneFactory {
    public static Phone getCar(String name){
        Phone phone=null;
        if(name.equals("OppO")){
            phone=new OppOPhone();
        }else if(name.equals("Apple")){
            phone=new ApplePhone();
        }
        return  phone;
    }

    public static void main(String[] args) {
        //跑到华强北，根据你的需求 给你配置啥手机，比如说你需要的是OppO手机 ，毕竟你不卖肾
        Phone oppO = getCar("OppO");
        oppO.feature();
    }
}
