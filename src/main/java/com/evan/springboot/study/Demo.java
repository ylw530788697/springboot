package com.evan.springboot.study;

import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        Map<Integer, Integer> map = new HashMap<>(2);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.get(1);

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
