package com.zjq.javadesignmode.ui.builder;

public class Client {
    public static void main(String[] args) {
        AbsHouse commandHouse = new CommandHouse();
        commandHouse.build();
    }
}
