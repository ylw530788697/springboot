package com.evan.springboot.designModel.buildFactory;

public class ConcreteBuilder implements Builder {

    private  Person person;

    public ConcreteBuilder(){
        person=new Person();
    }
    @Override
    public void builderHead() {
        person.setHead("建造者头部分");
    }

    @Override
    public void builderBody() {
        person.setBody("建造者身体部分");
    }

    @Override
    public void builderFoot() {
        person.setFoot("建造者头四肢部分");
    }

    @Override
    public Person BuilderPersion() {
        return person;
    }
}
