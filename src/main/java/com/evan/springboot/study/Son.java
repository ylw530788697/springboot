package com.evan.springboot.study;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/24 21:55
 */
public class Son extends Father {
    private int i=test();
    private static int j=method();

    private int test() {

        System.out.println("9");
        return 1;
    }


    private static int method() {
        System.out.println("10");
        return 1;
    }

    static {
        System.out.println("Son Static 6");
    }

    Son(){
        System.out.println("Son Constructor 7");
    }

    {
        System.out.println("代码块 8");
    }

    public static void main(String[] args) {
        Son son = new Son();
    }
}
