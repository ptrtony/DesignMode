package com.zjq.javadesignmode.ui.decorator;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink drink) {
        this.obj = drink;
    }
    @Override
    public float cost() {
        return super.getPrice() + obj.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " "+ super.getPrice() + " && " + obj.getDesc();
    }
}
