package com.evan.springboot.study.designStudy.observer;

import java.io.Serializable;
import java.util.EventObject;

/**
 * 事件接口
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 3:40
 */
public interface Event extends Serializable {
    //获取事件持有的对象
    EventObject getEventObject();

    //设置事件持有的数据对象
    void setEventObject(EventObject eventObject);
}
