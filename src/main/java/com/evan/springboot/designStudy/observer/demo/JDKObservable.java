package com.evan.springboot.designStudy.observer.demo;

import java.util.Observable;

/**
 * 被观察者实现
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 5:32
 */
public class JDKObservable extends Observable {
    private int state;

    public void set(int s){
        state=s;
        setChanged();
        notifyObservers(state);
    }

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state=state;
    }
}
