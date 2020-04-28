package com.evan.springboot.designStudy.factory.abstractFactor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:40
 */
public class WoodChair implements Chair {
    @Override
    public void appearance() {
        System.out.println("舒适度不高，性价比高，便宜");
    }
}
