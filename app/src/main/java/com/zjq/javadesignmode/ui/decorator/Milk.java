package com.zjq.javadesignmode.ui.decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc(" 牛奶 ");
        setPrice(2.0f);
    }
}
