package com.zjq.javadesignmode.ui.observer.improve;

import java.util.ArrayList;

/**
 * 类的核型
 * 1、包含最新的天气情况信息
 * 2、含有CurrentConditions对象
 * 3、当数据有更新时，主动的调用CurrentConditions对象update方法（含Display）
 * 这样他们（接入方）就看到最新的信息
 */
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void dataChange() {
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
