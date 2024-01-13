package com.zjq.javadesignmode.ui.strategy.improve;

public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不能叫");
    }
}
