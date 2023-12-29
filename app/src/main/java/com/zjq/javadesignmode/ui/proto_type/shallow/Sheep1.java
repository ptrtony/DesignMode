package com.zjq.javadesignmode.ui.proto_type.shallow;

import androidx.annotation.NonNull;

public class Sheep1 implements Cloneable {

    private String name;
    private int age;
    private String color;

    public Sheep1(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @NonNull
    @Override
    protected Object clone() {
        Sheep1 sheep1 = null;
        try {
            sheep1 = (Sheep1) super.clone();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return sheep1;
    }
}
