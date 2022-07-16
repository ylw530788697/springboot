package com.evan.springboot.study.designStudy.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:31
 */
public interface Subject<T> {
    //存储订阅者
    List<Observer> list= new ArrayList<>();

    //注册订阅者
    public void registerObserver(T obs);
    //移除订阅者
    public void removerObserver(T obs);
    //通知所有观察者更新状态
    public void notifyAllObserver();
}
