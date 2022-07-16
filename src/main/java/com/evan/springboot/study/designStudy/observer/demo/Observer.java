package com.evan.springboot.study.designStudy.observer.demo;

/**
 * 观察者
 * @author evanYang
 * @version 1.0
 * @date 2020/5/14 下午 4:37
 */
public interface Observer {
    void update(Subject subject);
}
