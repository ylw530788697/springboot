package com.evan.springboot.concurrentDemo.communication;

import com.alibaba.fastjson.JSONObject;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/04 09:53
 */
public class OoutThread extends Thread {
    private Res res;

    public OoutThread(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true){
            synchronized(res){
                if (!res.isFlagDemo()){
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(JSONObject.toJSONString(res));
                res.setFlagDemo(false);
                res.notify();
            }
        }
    }
}
