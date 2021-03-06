package com.evan.springboot.designModel.observerPattern;

public class CurrentConditions implements  Observer{
    private float mTemperature;
    private float mPressure;
    //湿度
    private float mHumidity;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mHumidity=mHumidity;
        this.mPressure=mPressure;
        this.mTemperature=mTemperature;
        display();
    }

    public void display(){
        System.out.println("today temperature is :"+mTemperature);
        System.out.println("today mPressure is :"+mPressure);
        System.out.println("today mHumidity is :"+mHumidity);
    }
}
