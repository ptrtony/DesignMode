package com.zjq.javadesignmode.ui.singleton;

public class Singleton05 {
    private static Singleton05 sSingleton03;
    private Singleton05() {
    }
    public static Singleton05 getInstance() {
        if (sSingleton03 == null) {
            synchronized (Singleton05.class) {
                sSingleton03 = new Singleton05();
            }
        }
        return sSingleton03;
    }
}
