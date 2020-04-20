package com.evan.springboot.designStudy.SingleDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/20 16:15
 */
public class SingleLanHan {
    //构造方法私有化
    private SingleLanHan(){}

    private static SingleLanHan singleLanHan=null;

    //
    public static synchronized SingleLanHan getInstance(){
        if (singleLanHan==null){
            singleLanHan=new SingleLanHan();
        }else{
            return singleLanHan;
        }
        return  singleLanHan;
    }

    public static void main(String[] args) {
        SingleLanHan instance = getInstance();
        SingleLanHan instance1 = getInstance();
        System.out.println(instance==instance1);
    }
}
