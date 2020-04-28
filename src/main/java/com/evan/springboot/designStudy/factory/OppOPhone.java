package com.evan.springboot.designStudy.factory;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 下午 2:02
 */
public class OppOPhone implements Phone {
    @Override
    public void feature() {
        System.out.println("外观漂亮，拍照美美哒，深受女性喜爱，配置差劲，光有虚表");
    }

}
