package com.evan.springboot.study.designStudy.template;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/27 20:40
 */
public abstract class BankTemplate {
    //第一步：取号排队
    public void takeNumber(){
        System.out.println("取号排队");
    }

    //第二步：每一个人办理的业务可能不一样  有可能是取钱 开卡 等等
    abstract void tramsact();

    //第三步：办理好后 评价
    public void evaluate(){
        System.out.println("反馈评价");
    }

    public void process(){
        takeNumber();
        tramsact();
        evaluate();
    }
}
