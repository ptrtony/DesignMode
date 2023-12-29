package com.zjq.javadesignmode.ui.proto_type.shallow;

public class Client1 {
    public static void main(String[] args) {
        Sheep1 sheep = new Sheep1("tom", 1, "白色");
        Sheep1 sheep1 = (Sheep1) sheep.clone();
        Sheep1 sheep2 = (Sheep1) sheep.clone();
        Sheep1 sheep3 = (Sheep1) sheep.clone();
        Sheep1 sheep4 = (Sheep1) sheep.clone();
    }
}
