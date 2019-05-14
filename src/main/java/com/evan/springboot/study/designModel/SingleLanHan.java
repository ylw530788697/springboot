package com.evan.springboot.study.designModel;

//懒汉
public class SingleLanHan {
    private static SingleLanHan singleLanHan;

    private SingleLanHan(){}

    public synchronized  static SingleLanHan getInstance(){
        if (singleLanHan==null){
            singleLanHan=new SingleLanHan();
        }
        return  singleLanHan;
    }
    public synchronized  static SingleLanHan getDouble(){
        if (singleLanHan==null){
            synchronized (SingleLanHan.class){
                if (singleLanHan==null){
                    singleLanHan=new SingleLanHan();
                }
            }
        }
        return  singleLanHan;
    }
}
