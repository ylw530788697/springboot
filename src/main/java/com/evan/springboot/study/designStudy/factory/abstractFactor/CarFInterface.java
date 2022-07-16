package com.evan.springboot.study.designStudy.factory.abstractFactor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/25 上午 11:42
 */
public interface CarFInterface {
    Engine createEngine();
    Chair createChair();
}
