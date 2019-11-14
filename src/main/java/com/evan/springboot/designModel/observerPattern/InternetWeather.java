package com.evan.springboot.designModel.observerPattern;

public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions=new CurrentConditions();
        WeatherData weatherData=new WeatherData();
        weatherData.setData(15,150,14);
    }
}
