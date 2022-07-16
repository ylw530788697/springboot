package com.evan.springboot.study.designStudy.observer;

import com.alibaba.fastjson.JSONObject;

import java.util.EventObject;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:08
 */
public class Test1EventListener extends AbstractEventListener {
    public Test1EventListener(int order){
        super(order);
    }

    @Override
    public void onEvent(Event event) {
        System.out.println("事件监听器1执行");

        //获取监听对象
        EventObject eventObject = event.getEventObject();
        System.out.println(JSONObject.toJSONString(eventObject));
        System.out.println("执行事件1的业务逻辑");
    }
}
