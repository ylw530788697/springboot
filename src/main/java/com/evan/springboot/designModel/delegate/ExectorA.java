package com.evan.springboot.designModel.delegate;

//想法 用代码来描述这种想法
public class ExectorA implements IExector {
    @Override
    public void doing() {
        System.out.println("员工A开始执行任务");
    }
}
