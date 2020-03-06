package com.evan.springboot.study.basic.money;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/18/2019 11:45
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int delete=list.remove(index);
        int money=super.getMoney();
        super.setMoney(money+delete);
    }
}
