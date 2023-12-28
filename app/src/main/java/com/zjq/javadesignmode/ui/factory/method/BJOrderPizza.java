package com.zjq.javadesignmode.ui.factory.method;

import com.zjq.javadesignmode.ui.factory.Pizza;

import java.util.Objects;

public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        if ("cheese".equals(orderType)) {
            return new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            return new BJPepperPizza();
        }
        return null;
    }
}
