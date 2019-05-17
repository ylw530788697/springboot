package com.evan.springboot.designModel.DecoratorPattern;

public abstract class Drink {
    public String description="";
    private float price=0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description+"-"+this.getPrice();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public abstract float cost();

}
