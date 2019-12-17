package com.evan.springboot.study.basic;

import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/06/2019 11:25
 */
@Data
public class Phone {
    private String brond;
    private double price;
    private String color;

    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
}
