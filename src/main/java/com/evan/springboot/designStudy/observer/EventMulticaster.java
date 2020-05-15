package com.evan.springboot.designStudy.observer;

import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 事件广播器
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:13
 */
@NoArgsConstructor
public class EventMulticaster {
    private List<AbstractEventListener> listeners;

    public EventMulticaster(List<AbstractEventListener> listeners){
        this.listeners=listeners;
    }

    public void multicastEvent(Event event){
        listeners.forEach(x->x.onEvent(event));
    }
}
