package com.evan.springboot.designModel.delegate;

public class Dispatcher implements  IExector {
    IExector iExector;
    public Dispatcher(IExector iExector){
        this.iExector=iExector;
    }

    //项目经理，虽然也有执行方法
    //但是他的工作就是分配任务
    @Override
    public void doing() {
        this.iExector.doing();
    }
}
