package com.evan.springboot.designModel.DecoratorPattern;

public class Decorator extends  Drink{
    private Drink drink;
    public Decorator(Drink drink){
        this.drink=drink;
    }
    @Override
    public float cost() {
        return super.getPrice()+drink.getPrice();
    }
    @Override
    public String getDescription(){
        return super.getDescription()+"-"+super.getPrice()+"&&"+drink.getDescription();
    }
}
