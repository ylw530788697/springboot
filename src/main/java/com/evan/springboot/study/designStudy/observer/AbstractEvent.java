package com.evan.springboot.study.designStudy.observer;

import java.util.EventObject;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 3:43
 */
public class AbstractEvent implements Event {
    private static final long serialVersionUID = -2724141561135776592L;

    private long timestamp;
    private EventObject eventObject;

    public AbstractEvent(EventObject object){
        this.setEventObject(eventObject);
    }
    @Override
    public EventObject getEventObject() {
        return eventObject;
    }

    @Override
    public void setEventObject(EventObject eventObject) {
        this.eventObject=eventObject;
        this.timestamp=System.currentTimeMillis();
    }

    public long getTimestamp(){
        return this.timestamp;
    }
}
