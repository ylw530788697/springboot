package com.evan.springboot.designModel.observerPattern;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements  Subject{

    private float mTemperature;
    private float mPressure;
    //湿度
    private float mHumidity;

    private List<Observer> list;

    private CurrentConditions currentConditions;
    public WeatherData(){
        list=new ArrayList<>(5);
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(float mTemperature) {
        this.mTemperature = mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public void setmPressure(float mPressure) {
        this.mPressure = mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(float mHumidity) {
        this.mHumidity = mHumidity;
    }

    public void dataChange(){
        notifyObservers();
        //currentConditions.update(getmTemperature(),getmPressure(),getmHumidity());
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mHumidity=mHumidity;
        this.mPressure=mPressure;
        this.mTemperature=mTemperature;
        //dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(list.contains(observer)){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        list.forEach(observer -> {
            observer.update(getmTemperature(),getmPressure(),getmHumidity());
        });
    }
}
