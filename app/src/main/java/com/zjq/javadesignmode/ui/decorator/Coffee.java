package com.zjq.javadesignmode.ui.decorator;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
