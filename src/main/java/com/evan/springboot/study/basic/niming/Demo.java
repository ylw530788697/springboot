package com.evan.springboot.study.basic.niming;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/19/2019 16:54
 */
/*
* 如果接口的实现类只需要使用唯一的一次
* 那么这种情况下就可以省略掉该类的定义
*
* */
public class Demo {
    public static void main(String[] args) {
        new MyInterfaceImpl().method();
    }
}
