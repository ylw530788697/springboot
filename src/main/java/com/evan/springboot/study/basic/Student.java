package com.evan.springboot.study.basic;

import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/06/2019 11:24
 */
@Data
public class Student {
    private String name;
    private int age;

    public void eat(){
        System.out.println("吃防范");
    }
}
