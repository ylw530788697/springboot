package com.evan.springboot.study.designStudy.SingleDemo;

import com.evan.springboot.designModel.single.LanHanDemo;
import lombok.SneakyThrows;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/20 16:15
 */
public class SingleLanHan {
    ////构造方法私有化
    //private SingleLanHan(){}
    //
    //private static SingleLanHan singleLanHan=null;
    //
    ////
    //public static synchronized SingleLanHan getInstance(){
    //    if (singleLanHan==null){
    //        singleLanHan=new SingleLanHan();
    //    }else{
    //        return singleLanHan;
    //    }
    //    return  singleLanHan;
    //}
    //
    //public static void main(String[] args) {
    //    SingleLanHan instance = getInstance();
    //    SingleLanHan instance1 = getInstance();
    //    System.out.println(instance==instance1);
    //}


    private SingleLanHan() {
    }

    private static volatile SingleLanHan instance = null;

    public static SingleLanHan getInstance() {
        if (instance == null) {
            synchronized (LanHanDemo.class) {
                if (instance == null) {
                    instance = new SingleLanHan();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                SingleLanHan singleLanHan=SingleLanHan.getInstance();
                Thread.sleep(100);
                System.out.println(singleLanHan);
            }
        }).start();

        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(100);
                SingleLanHan singleLanHan=SingleLanHan.getInstance();
                System.out.println(singleLanHan);
            }
        }).start();
    }
}
