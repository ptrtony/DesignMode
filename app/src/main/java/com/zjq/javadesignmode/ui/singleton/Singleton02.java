package com.zjq.javadesignmode.ui.singleton;

public class Singleton02 {
    private static Singleton02 sSingleton02;

    static {
        sSingleton02 = new Singleton02();
    }

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return sSingleton02;
    }

}
