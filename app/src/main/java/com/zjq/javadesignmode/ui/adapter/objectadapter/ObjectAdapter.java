package com.zjq.javadesignmode.ui.adapter.objectadapter;

import com.zjq.javadesignmode.ui.adapter.classadapter.IVoltage5V;
import com.zjq.javadesignmode.ui.adapter.classadapter.Voltage220V;

public class ObjectAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public ObjectAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220v();
        int destV = src / 44;
        return destV;
    }
}
