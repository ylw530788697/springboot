package com.evan.springboot.study.basic.collectionDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/24/2019 15:21
 */
public class GenericMethod {
    public <T> void demo(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.demo("sssss");
    }
}
