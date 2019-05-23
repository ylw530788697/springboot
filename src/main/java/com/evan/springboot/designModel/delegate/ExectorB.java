package com.evan.springboot.designModel.delegate;

//想法 用代码来描述这种想法
public class ExectorB implements IExector {
    @Override
    public void doing() {
        System.out.println("员工B执行任务");
    }
}
