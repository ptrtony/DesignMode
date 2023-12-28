package com.zjq.javadesignmode.ui.factory.abs;

import com.zjq.javadesignmode.ui.factory.Pizza;
import com.zjq.javadesignmode.ui.factory.method.BJPepperPizza;

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        if ("pepper".equals(orderType)) {
            return new BJPepperPizza();
        } else if ("cheese".equals(orderType)) {
            return new BJPepperPizza();
        }
        return null;
    }
}
