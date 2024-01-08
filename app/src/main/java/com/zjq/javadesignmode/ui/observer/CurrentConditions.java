package com.zjq.javadesignmode.ui.observer;


//显示当前天气情况（可以理解成是气象站自己的网站）
public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("***Today Temperature: + " + temperature + " ***");
        System.out.println("***Today Pressure: + " + pressure + " ***");
        System.out.println("***Today Humidity: + " + humidity + " ***");
    }
}
