package com.evan.springboot.concurrentDemo.ThreadLocalDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 11:50
 */
public class Res {
    public static Integer count=0;

    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 0;
        };

    };

    public Integer getNum(){
        threadLocal.set(threadLocal.get()+1);
        return  threadLocal.get();
    }
}
