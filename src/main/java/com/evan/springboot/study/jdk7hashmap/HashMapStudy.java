package com.evan.springboot.study.jdk7hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("周瑜","周瑜");
        map.put("曹操","曹操");
        map.put("刘备","刘备");
        map.put("孙权","孙权");
        map.put("诸葛亮","诸葛亮");
        map.put("曹操1","曹操1");
        map.put("曹操2","曹操2");
        map.put("周瑜1","周瑜1");
        map.put("周瑜2","周瑜2");
        map.put("周瑜3","周瑜3");

        map.keySet().forEach(key->{
            Integer hash=key.hashCode();
            Integer index=hash%8;
            System.out.println(String.format("%s的hash值是：%s,index is %s",key,hash,index));
        });

    }
}
