package com.evan.springboot.designStudy.observer.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 5:38
 */
public class JDKObserver implements Observer {
    private int myState;
    @Override
    public void update(Observable o, Object arg) {
        myState = ((JDKObservable)o).getState();
    }

    public int getMyState() {
        return myState;
    }
    public void setMyState(int myState) {
        this.myState = myState;
    }
}
