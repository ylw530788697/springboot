package com.evan.springboot.designStudy.observer.demo;

/**
 *
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:38
 */
public class OrderBackSubject implements Subject<Observer> {
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state=state;
        //主题对象（目标对象）值发生了变化，请通知所有的观察者
        this.notifyAllObserver();
    }
    @Override
    public void registerObserver(Observer obs) {
        list.add(obs);
    }

    @Override
    public void removerObserver(Observer obs) {
        list.remove(obs);
    }

    @Override
    public void notifyAllObserver() {
        list.forEach(x->{
            x.update(this);
        });
    }

    public void orderBack(){
        //更改订单状态
        updateOrderState();
        //发放资源权限
        grantResource();
        //添加会员权限
        grantVip();
    }

    private void grantResource() {
    }

    private void updateOrderState() {
    }
    private void grantVip(){

    }
}
