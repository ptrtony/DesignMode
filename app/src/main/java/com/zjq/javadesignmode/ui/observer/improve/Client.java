package com.zjq.javadesignmode.ui.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        weatherData.setData(30, 150, 23);

        Baidu baidu = new Baidu();
        weatherData.registerObserver(baidu);
        weatherData.setData(30, 140, 70);
    }
}
