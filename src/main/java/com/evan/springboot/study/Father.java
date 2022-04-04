package com.evan.springboot.study;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/24 21:52
 */
public class Father {
    private int i=test();
    private static int j=method();

    private int test() {
        System.out.println("4");
        return 1;
    }


    private static int method() {
        System.out.println("5");
        return 1;
    }

    static {
        System.out.println("Father Static 1");
    }

    Father(){
        System.out.println("Father Constructor 2");
    }

    {
        System.out.println("代码块 3");
    }


}
