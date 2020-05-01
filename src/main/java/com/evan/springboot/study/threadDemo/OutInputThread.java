package com.evan.springboot.study.threadDemo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/01 11:04
 */
@Data
class Res {
    private String name;
    private String sex;
    private boolean flagDemo = false;
}

class Input extends Thread {
    private Res res;

    public Input(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (res) {
                if (res.isFlagDemo()) {
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (i == 0) {
                    res.setName("张三");
                    res.setSex("男");
                } else {
                    res.setName("赵丽颖");
                    res.setSex("女");
                }
                i = (i + 1) % 2;
                res.notify();
                res.setFlagDemo(true);
            }

        }
    }
}

class Output extends Thread {
    private Res res;

    public Output(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (res) {
                if (!res.isFlagDemo()) {
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(JSONObject.toJSONString(res));
                res.notify();
                res.setFlagDemo(false);
            }
        }
    }
}

public class OutInputThread {
    public static void main(String[] args) throws InterruptedException {
        Res res = new Res();
        Input input = new Input(res);
        Output output = new Output(res);
        input.start();
        output.start();

    }
}
