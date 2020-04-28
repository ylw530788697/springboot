package com.evan.springboot.designStudy.factory.function;

import com.evan.springboot.designStudy.factory.ApplePhone;
import com.evan.springboot.designStudy.factory.Phone;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 下午 2:36
 */
public class AppleStore implements Store {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
