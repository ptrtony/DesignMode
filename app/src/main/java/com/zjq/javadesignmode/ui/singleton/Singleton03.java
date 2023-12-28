package com.zjq.javadesignmode.ui.singleton;

public class Singleton03 {
    private static Singleton03 sSingleton03;
    private Singleton03() {
    }
    public static Singleton03 getInstance() {
        if (sSingleton03 == null) {
            sSingleton03 = new Singleton03();
        }
        return sSingleton03;
    }
}
