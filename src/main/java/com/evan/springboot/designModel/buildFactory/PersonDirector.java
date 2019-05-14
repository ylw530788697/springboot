package com.evan.springboot.designModel.buildFactory;

public class PersonDirector {
    public Person constructPersion(Builder builder){
        builder.builderBody();
        builder.builderHead();
        builder.builderFoot();
        return builder.BuilderPersion();
    }

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person person=personDirector.constructPersion(new ConcreteBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.toString();

    }
}
