package com.evan.springboot.study.basic.money;

import java.util.ArrayList;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/18/2019 11:48
 */
public class Demo{
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member one = new Member("one", 0);
        Member two = new Member("two", 0);
        Member thre = new Member("thre", 0);
        manager.show();
        one.show();
        two.show();
        thre.show();

        ArrayList<Integer> send = manager.send(50, 3);
        one.receive(send);
        two.receive(send);
        thre.receive(send);
        manager.show();
        one.show();
        two.show();
        thre.show();
    }
}
