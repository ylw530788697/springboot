package com.evan.springboot.study.designStudy.factory.function;

import com.evan.springboot.study.designStudy.factory.Phone;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 下午 2:40
 */
public class Demo {
    public static void main(String[] args) {
        //深南大道新开了一家AppleStore  打折
        Store store = new AppleStore();
        //小白赶紧去买了一个苹果手机
        Phone phone = store.createPhone();
        //买来很开心 赶紧在朋友圈晒晒
        phone.feature();
    }
}
