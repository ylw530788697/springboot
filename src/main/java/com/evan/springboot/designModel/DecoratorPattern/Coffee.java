package com.evan.springboot.designModel.DecoratorPattern;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
