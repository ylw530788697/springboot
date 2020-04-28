package com.evan.springboot.designStudy.factory.abstractFactor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:39
 */
public class ZhenPiChair implements Chair{

    @Override
    public void appearance() {
        System.out.println("纯皮座椅，舒服，贵");
    }
}
