package com.evan.springboot.designModel.single;

public class SingleEhan {
    private SingleEhan singleEhan=new SingleEhan();
    private SingleEhan(){}
    public SingleEhan getInstance(){
        return  singleEhan;
    }
}
