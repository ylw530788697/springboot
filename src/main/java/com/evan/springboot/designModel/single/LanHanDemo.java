package com.evan.springboot.designModel.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/20/2019 10:06
 */
public class LanHanDemo {
    private LanHanDemo(){}
    private static volatile LanHanDemo lanHanDemo;
    public static LanHanDemo getInstance(){
        if (lanHanDemo==null){
            synchronized (LanHanDemo.class){
                if (lanHanDemo==null){
                    lanHanDemo=new LanHanDemo();
                    return lanHanDemo;
                }
            }
        }
        return lanHanDemo;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 15; i++) {
            executorService.submit(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(LanHanDemo.getInstance());
                            System.out.println(Thread.currentThread().getName());
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    });
        }


    }
}
