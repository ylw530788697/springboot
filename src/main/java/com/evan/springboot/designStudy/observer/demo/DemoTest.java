package com.evan.springboot.designStudy.observer.demo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:54
 */
public class DemoTest {
    public static void main(String[] args) {
        OrderBackSubject subject = new OrderBackSubject();

        //创建多个观察者
        ObserverCourse obs1 = new ObserverCourse();
        ObserverVip  obs2 = new ObserverVip();

        //将这三个观察者添加到subject对象的观察者队伍中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);

        //改变subject的状态
        subject.setState(3000);
        //我们看看，观察者的状态是不是也发生了变化
        System.out.println(obs1.getMystate());
        System.out.println(obs2.getMystate());


        JDKObservable observable = new JDKObservable();
        JDKObserver jdkObserver = new JDKObserver();
        JDKObserver jdkObserver2 = new JDKObserver();
        observable.addObserver(jdkObserver);
        observable.addObserver(jdkObserver2);
        observable.set(100);
        System.out.println("dddddddddddddd");
        System.out.println(jdkObserver.getMyState());
        System.out.println(jdkObserver2.getMyState());
        observable.set(200);
        System.out.println("dddddddddddddd");
        System.out.println(jdkObserver.getMyState());
        System.out.println(jdkObserver2.getMyState());

    }
}
