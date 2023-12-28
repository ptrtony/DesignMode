package com.zjq.javadesignmode.ui.factory.abs;

import com.zjq.javadesignmode.ui.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        AbsFactory absFactory = null;
        Pizza pizza = null;
        String orderType;
        String address;
        do {
            address = getAddress();
            if ("LD".equals(address)) {
                absFactory = new LDFactory();
            } else if ("BJ".equals(address)) {
                absFactory = new BJFactory();
            } else {
                absFactory = new BJFactory();
            }
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类：");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private String getAddress() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 地点：");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
