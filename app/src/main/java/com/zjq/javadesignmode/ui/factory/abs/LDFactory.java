package com.zjq.javadesignmode.ui.factory.abs;

import com.zjq.javadesignmode.ui.factory.Pizza;
import com.zjq.javadesignmode.ui.factory.method.LDCheesePizza;
import com.zjq.javadesignmode.ui.factory.method.LDPepperPizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if ("pepper".equals(orderType)) {
            return new LDPepperPizza();
        } else if ("cheese".equals(orderType)) {
            return new LDCheesePizza();
        }
        return null;
    }
}
