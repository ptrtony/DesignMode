package com.zjq.javadesignmode.ui.adapter.objectadapter;

import com.zjq.javadesignmode.ui.adapter.classadapter.Phone;
import com.zjq.javadesignmode.ui.adapter.classadapter.Voltage220V;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        ObjectAdapter objectAdapter = new ObjectAdapter(new Voltage220V());
        phone.charging(objectAdapter);
    }
}
