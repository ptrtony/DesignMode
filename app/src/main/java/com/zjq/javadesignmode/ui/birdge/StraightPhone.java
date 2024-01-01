package com.zjq.javadesignmode.ui.birdge;

public class StraightPhone extends Phone{
    public StraightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("直板机样式");
    }

    public void close() {
        super.close();
        System.out.println("直板机样式");
    }

    public void call() {
        super.call();
        System.out.println("直板机样式");
    }
}
