package com.evan.springboot.study;

import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/13 下午 2:44
 */
@Data
public class Demo {
    private Integer a;

    public Demo(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        //ReentrantLock lock=new ReentrantLock();
        //lock.tryLock(){
        //}
        HashMap<Demo, Integer> map = new HashMap<>();
        Demo demo = new Demo(1);
        map.put(demo, 1);
        System.out.println("put 时的hashCode" + demo.hashCode());

        Demo demo1 = new Demo(1);
        map.put(demo1, 2);
        System.out.println("get 时的hashCode" + demo1.hashCode());
        Integer value = map.get(demo);
        System.out.println(value);

        Integer value1 = map.get(demo1);
        System.out.println(value1);
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o instanceof Demo;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        return result;
    }*/
}
