package com.evan.springboot.designModel.observerPattern;

public interface Observer {
    public void update(float mTemperature, float mPressure, float mHumidity);
}
