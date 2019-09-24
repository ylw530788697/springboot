package com.evan.springboot.designModelPractice.abstractFactory;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 15:31
 */
public interface CarFactory {
    public Engine createEngine();
    public Chair createChair();
}
