package com.evan.springboot.designStudy.observer;

import java.util.EventObject;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 3:57
 */
public class OrderCallBackEvent extends AbstractEvent {
    private static final long serialVersionUID = -8359585844643634813L;

    public OrderCallBackEvent(EventObject object) {
        super(object);
    }
}
