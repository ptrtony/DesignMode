package com.zjq.javadesignmode.ui.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OrderPizza {
    private SimpleFactory1 simpleFactory1;
    public OrderPizza(SimpleFactory1 simpleFactory1) {
        setSimpleFactory1(simpleFactory1);
    }

    public void setSimpleFactory1(SimpleFactory1 factory) {
        this.simpleFactory1 = factory;
        String orderType;
        Pizza pizza;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
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
}
