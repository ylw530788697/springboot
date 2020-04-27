package com.evan.springboot.designStudy.SingleDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/20 16:27
 */
public class SingleEnum {
    //构造方法私有化
    private SingleEnum(){}

    public static SingleEnum getInstance(){
        return SingleDeme.INSTANCE.getInstance();
    }

    enum SingleDeme{
        INSTANCE;
        private  SingleEnum singleEnum;
        private SingleDeme(){
            singleEnum=new SingleEnum();
        }
        public SingleEnum getInstance(){
            return this.singleEnum;
        }
    }

    public static void main(String[] args) {
        SingleEnum instance = SingleEnum.getInstance();
        SingleEnum instance1 = SingleEnum.getInstance();
        System.out.println(instance==instance1);
    }
}
