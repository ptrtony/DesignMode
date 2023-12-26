package com.zjq.javadesignmode.ui.singleton;

public class SingleTon01 {
    private SingleTon01() {
    }

    private final static SingleTon01 sInstance = new SingleTon01();

    public static SingleTon01 getInstance() {
        return sInstance;
    }

}
