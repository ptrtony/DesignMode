package com.zjq.javadesignmode.ui.strategy.improve;

public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("---------北京鸭-----------");
    }


}
