package com.zjq.javadesignmode.ui.strategy.improve;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔的很坏");
    }
}
