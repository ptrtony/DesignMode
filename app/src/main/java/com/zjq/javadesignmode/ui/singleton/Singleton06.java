package com.zjq.javadesignmode.ui.singleton;

public class Singleton06 {
    private static Singleton06 sSingleton03;
    private Singleton06() {
    }
    public static Singleton06 getInstance() {
        if (sSingleton03 == null) {
            synchronized (Singleton06.class) {
                if (sSingleton03 == null) {
                    sSingleton03 = new Singleton06();
                }
            }
        }
        return sSingleton03;
    }
}
