package com.evan.springboot.designModel.adapterFactory;

public class ElectricCooker {
    private JP110VInterface jp110VInterface;

    ElectricCooker(JP110VInterface jp110VInterface){
        this.jp110VInterface=jp110VInterface;
    }
    public void cook(){
        jp110VInterface.connect();
        System.out.println("开始做饭啦....");
    }
}
