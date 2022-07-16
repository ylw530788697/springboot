package com.evan.springboot.study.designStudy.SingleDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/20 16:13
 */
public class SingleEhan {

    //构造函数私有化
    private SingleEhan() {
    }

    private static final SingleEhan singleEhan=new SingleEhan();

    public static SingleEhan getInstans(){
        return singleEhan;
    }
}
