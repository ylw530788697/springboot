package com.evan.springboot.designModel.templateFactry;

public abstract class BankTemplateMethod {
    //1，取号排队
    public void takeNumber(){
        System.out.println("取号排队");
    }
    //2每个子类不同的业务实现，由各自子类实现
    abstract void transact();

    //评价
    public void evaluate(){
        System.out.println("反馈评价");
    }

    public void process(){
        takeNumber();
        transact();
        evaluate();
    }
}
