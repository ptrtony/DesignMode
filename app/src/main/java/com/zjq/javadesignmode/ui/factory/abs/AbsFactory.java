package com.zjq.javadesignmode.ui.factory.abs;

import com.zjq.javadesignmode.ui.factory.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);

}
