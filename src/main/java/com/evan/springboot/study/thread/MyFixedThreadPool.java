package com.evan.springboot.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/04/23 15:27
 */
public class MyFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 4; i++) {
            int temp=i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("execute;"+Thread.currentThread().getName()+",i"+temp);
                }
            });
        }


        List<Future<String>> list = new ArrayList<Future<String>>();
        for (int i = 0; i < 3; i++) {
            Future<String> submit = fixedThreadPool.submit(new CallableWithResult(i));
            list.add(submit);
        }
        for (Future<String> future : list) {
            try {
                System.out.println("future result is "+future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }


}
class CallableWithResult implements Callable<String>{
    private int id;
    public CallableWithResult(int id){
        id=this.id;
    }
    @Override
    public String call() throws Exception {
        System.out.println("call()方法被自动调用,干活！！！             " + Thread.currentThread().getName());
        // 下面的判读是模拟一个抛出异常的操作，随机得到一个true
        if (new Random().nextBoolean())
            throw new TaskException("Meet error in task." + Thread.currentThread().getName());
        // 一个模拟耗时的操作
        for (int i = 999999; i > 0; i--)
            ;
        return "call()方法被自动调用，任务的结果是：" + id + "    " + Thread.currentThread().getName();
    }
}
class TaskException extends Exception{
    public TaskException(String message){
        super(message);
    }
}
