package com.zjq.javadesignmode.ui.strategy.improve;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    abstract void display();

    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
