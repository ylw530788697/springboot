package com.evan.springboot.study.basic.money;

import java.util.ArrayList;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/18/2019 11:23
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
     public ArrayList<Integer> send(int totalMoney,int count){
         ArrayList<Integer> redList = new ArrayList<>();
         int leftMoney=super.getMoney();
         if (totalMoney>leftMoney){
             System.out.println("余额不足");
             return  redList;
         }
         //群主扣钱
         super.setMoney(leftMoney-totalMoney);

         int avg=totalMoney/count;
         int mod=totalMoney%count;
         for (int i = 0; i < count-1; i++) {
             redList.add(avg);
         }
         redList.add(avg+mod);
         return  redList;
     }
}
