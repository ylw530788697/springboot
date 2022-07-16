package com.evan.springboot.study.designStudy;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/26 15:13
 */
public class OppOStore implements Store {
    @Override
    public Phone get2018Phone() {
        return new OppOA8();
    }

    @Override
    public Phone get2019Phone() {
        return new OppOA9();
    }
}
