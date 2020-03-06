package com.evan.springboot.study.basic.setDemo;

import springfox.documentation.service.ApiListing;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/27/2019 15:08
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("ccc");
        set.add("ddd");
        set.add("1245");
        System.out.println(set);

        LinkedHashSet<Object> objects = new LinkedHashSet<>();
        objects.add("abc");
        objects.add("ccc");
        objects.add("ddd");
        System.out.println(objects);
    }
}
