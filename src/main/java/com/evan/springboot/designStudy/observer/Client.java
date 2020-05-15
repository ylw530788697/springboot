package com.evan.springboot.designStudy.observer;

import java.util.ArrayList;
import java.util.EventObject;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:16
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<AbstractEventListener> listeners = new ArrayList<>();
        listeners.add(new Test1EventListener(1));
        listeners.add(new Test2EventListener(2));

        //定义广播器
        EventMulticaster eventMulticaster = new EventMulticaster(listeners);

        EventObject eventObject = new EventObject("dddddd");
        eventMulticaster.multicastEvent(new OrderCallBackEvent(eventObject));
    }
}
