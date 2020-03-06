package com.evan.springboot.study.basic.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/24/2019 15:25
 */
public class GenericInterfaceImpl implements  GenericInterface {
    @Override
    public void method(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        //GenericInterfaceImpl genericInterface = new GenericInterfaceImpl();
        //genericInterface.method("dddddd");
        demo1();
    }

    public static void demo(){
        LinkedList<Integer> ints = new LinkedList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        System.out.println(ints);
    }
    public static void demo1(){
        Set<Integer> strings = new HashSet<>();
        strings.add(1);
        strings.add(2);
        strings.add(3);
        Iterator<Integer> iterator = strings.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
