package com.evan.springboot.study.basic.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/21/2019 14:27
 */
public class Demo {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        System.out.println(strings.isEmpty());
        System.out.println(strings);
        strings.add("aaa");
        System.out.println(strings);
    }
}
