package com.evan.springboot.study.designStudy;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/26 15:08
 */
public class AppleStore implements Store {


    @Override
    public Phone get2018Phone() {
        return new Apple6S();
    }

    @Override
    public Phone get2019Phone() {
        return new AppleXS();
    }
}
