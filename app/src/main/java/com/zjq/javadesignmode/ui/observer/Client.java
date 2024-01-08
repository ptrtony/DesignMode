package com.zjq.javadesignmode.ui.observer;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30, 150, 40);

        //天气情况发生变化
        weatherData.setData(25, 100, 54);
    }
}
