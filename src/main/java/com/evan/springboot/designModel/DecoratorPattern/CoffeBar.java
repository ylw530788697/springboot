package com.evan.springboot.designModel.DecoratorPattern;

public class CoffeBar {
    public static void main(String[] args) {
        Drink order;
        order=new DeCaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());

        System.out.println();
        System.out.println();

        order=new Coffee();
        //order=new DeCaf(order);
        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 desc:"+order.getDescription());

    }
}
