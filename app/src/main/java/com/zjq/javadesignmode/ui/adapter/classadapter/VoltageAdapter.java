package com.zjq.javadesignmode.ui.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        int src = output220v();
        int destV = src / 44;//转成5
        return destV;
    }
}
