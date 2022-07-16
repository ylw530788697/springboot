package com.evan.springboot.study.designStudy.SingleDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/20 16:53
 */
public class SingleDoubleLock {

    private static boolean flag=false;
    //构造方法私有化
    private SingleDoubleLock(){
    //    单例模式防止反射漏洞攻击
        if(!flag){
            flag=!flag;
        }else {
            throw  new RuntimeException("单例模式被侵犯");
        }
    }

    private static volatile SingleDoubleLock singleDoubleLock=null;

    //
    public static SingleDoubleLock getInstance(){
        if (singleDoubleLock==null){
            synchronized (SingleDoubleLock.class){
                if (singleDoubleLock==null){
                    singleDoubleLock=new SingleDoubleLock();
                }
            }
        }
        return  singleDoubleLock;
    }

    public static void main(String[] args) {
        SingleDoubleLock instance = getInstance();
        SingleDoubleLock instance1 = getInstance();
        System.out.println(instance==instance1);
    }
}
