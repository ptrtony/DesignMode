package com.zjq.javadesignmode.ui.observer;

/**
 * 类的核型
 * 1、包含最新的天气情况信息
 * 2、含有CurrentConditions对象
 * 3、当数据有更新时，主动的调用CurrentConditions对象update方法（含Display）
 * 这样他们（接入方）就看到最新的信息
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public void dataChange() {
        currentConditions.update(temperature, pressure, humidity);
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
}
