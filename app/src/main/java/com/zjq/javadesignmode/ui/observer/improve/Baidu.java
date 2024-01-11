package com.zjq.javadesignmode.ui.observer.improve;

public class Baidu implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("***Baidu Temperature: + " + temperature + " ***");
        System.out.println("***Baidu Pressure: + " + pressure + " ***");
        System.out.println("***Baidu Humidity: + " + humidity + " ***");
    }
}
