package com.zjq.javadesignmode.ui.factory.method;

import com.zjq.javadesignmode.ui.factory.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        if ("pepper".equals(orderType)) {
            return new LDPepperPizza();
        } else if ("cheese".equals(orderType)) {
            return new LDCheesePizza();
        }
        return null;
    }
}
