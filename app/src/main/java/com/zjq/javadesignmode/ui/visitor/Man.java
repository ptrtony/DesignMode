package com.zjq.javadesignmode.ui.visitor;

public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
