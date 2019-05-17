package com.evan.springboot.designModel.observerPattern;

public interface Subject {
    //注册观察者
    public void registerObserver(Observer observer);
    //移除观察者
    public void removeObserver(Observer observer);
    //通知观察者
    public void notifyObservers();
}
