package com.evan.springboot.study.designStudy.observer.demo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:52
 */
public class ObserverCourse implements Observer {
    private int mystate;
    @Override
    public void update(Subject subject) {
        mystate = ((OrderBackSubject) subject).getState();
        System.out.println("开始发放会员");
    }

    public int getMystate(){
        return mystate;
    }

    public void setMystate(int myState){
        this.mystate=mystate;
    }
}
