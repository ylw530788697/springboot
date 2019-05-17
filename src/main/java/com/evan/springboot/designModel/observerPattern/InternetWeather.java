package com.evan.springboot.designModel.observerPattern;

import sun.applet.Main;

public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions=new CurrentConditions();
        WeatherData weatherData=new WeatherData();
        weatherData.setData(15,150,14);
    }
}
