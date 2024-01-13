package com.zjq.javadesignmode.ui.strategy;

public class PekingDuck extends Duck {

    @Override
    void display() {
        System.out.println("---------北京鸭-----------");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
