package com.evan.springboot.designModelPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 14:05
 */
public class BMWCar implements Car {
    @Override
    public void run() {
        System.out.println("有个小姐姐坐在宝马里面哭");
    }

}
