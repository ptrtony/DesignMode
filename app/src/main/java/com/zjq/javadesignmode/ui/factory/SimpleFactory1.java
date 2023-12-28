package com.zjq.javadesignmode.ui.factory;

public class SimpleFactory1 {

    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");

        if (orderType.equals("cheese")) {
            return new CheesePizza();
        } else if (orderType.equals("greek")) {
            return new GreekPizza();
        } else if (orderType.equals("pepper")) {
            return new PepperPizza();
        }
        return null;
    }

    public static Pizza createStaticPizza(String orderType) {
        System.out.println("使用简单工厂模式");

        if (orderType.equals("cheese")) {
            return new CheesePizza();
        } else if (orderType.equals("greek")) {
            return new GreekPizza();
        } else if (orderType.equals("pepper")) {
            return new PepperPizza();
        }
        return null;
    }
}
