package com.evan.springboot.study.designStudy.observer;

import lombok.NoArgsConstructor;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:06
 */
@NoArgsConstructor
public class AbstractEventListener implements EventListeners {
    //监听器顺序
    private int order;

    public int getOrder(){
        return order;
    }

    public AbstractEventListener(int order){
        this.order=order;
    }
    @Override
    public void onEvent(Event event) {

    }
}
