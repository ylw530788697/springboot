package com.evan.springboot.concurrentDemo.communication;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/04 09:48
 */
public class IntThread extends Thread {
    private Res res;
    public IntThread(Res res){
        this.res=res;
    }
    @Override
    public void run() {
        int count=0;
        while (true){
            synchronized (res){
                if (res.isFlagDemo()){
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count==0){
                    res.setUserName("Evan");
                    res.setUserSex("男");
                }else{
                    res.setUserName("Vale");
                    res.setUserSex("女");
                }
                count=(count+1)%2;
                res.setFlagDemo(true);
                res.notify();
            }
        }
    }

}
