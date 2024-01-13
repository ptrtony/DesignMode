package com.zjq.javadesignmode.ui.strategy.improve;

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("--------野鸭----------");
    }
}
