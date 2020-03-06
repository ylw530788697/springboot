package com.evan.springboot.study.basic.money;

import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/18/2019 11:22
 */
@Data
public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println("我有多少钱："+money);
    }
}
