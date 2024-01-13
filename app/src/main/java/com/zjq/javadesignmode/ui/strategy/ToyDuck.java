package com.zjq.javadesignmode.ui.strategy;

public class ToyDuck extends Duck {
    @Override
    void display() {
        System.out.println("---------玩具鸭-----------");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳");
    }
}
