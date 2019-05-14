package com.evan.springboot.designModel.strategy;

abstract class Strateg{
    abstract void  algorithmInterface();
}
class  StrategA extends  Strateg{

    @Override
    void algorithmInterface() {
        System.out.println("初级会员实现A算法");
    }
}

class  StrategB extends  Strateg{

    @Override
    void algorithmInterface() {
        System.out.println("中级会员实现B算法");
    }
}

class  StrategC extends  Strateg{

    @Override
    void algorithmInterface() {
        System.out.println("高级会员实现C算法");
    }
}

class Content{
    Strateg strateg;
    public  Content(Strateg strateg){
        this.strateg=strateg;
    }
    public void algorithmInterface(){
        strateg.algorithmInterface();
    }
}
public class StrategyDemo {
    public static void main(String[] args) {
        Content content;
        Strateg strategA=new StrategA();
        content =new Content(strategA);
        content.algorithmInterface();

        Strateg strategB=new StrategB();
        content =new Content(strategB);
        content.algorithmInterface();

        Strateg strategC=new StrategC();
        content =new Content(strategC);
        content.algorithmInterface();
    }
}
