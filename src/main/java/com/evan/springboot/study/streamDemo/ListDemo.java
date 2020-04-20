package com.evan.springboot.study.streamDemo;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/02/18 12:22
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三丰");
        strings.add("李四");
        strings.add("王老五");
        strings.add("张无忌");
        strings.add("赵敏");
        strings.add("周芷若");

        ArrayList<String> strings1 = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith("张")) {
                strings1.add(s);
            }
        }

        ArrayList<String> strings2 = new ArrayList<>();
        for (String s : strings1) {
            if (s.length()==3) {
                strings2.add(s);
            }
        }
        strings2.forEach(x-> System.out.println(x));

        strings1.stream().filter(x->x.startsWith("张"))
                .filter(x->x.length()==3).forEach(x-> System.out.println(x));
    }
}
