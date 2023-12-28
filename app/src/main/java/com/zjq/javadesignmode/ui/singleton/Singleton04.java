package com.zjq.javadesignmode.ui.singleton;

public class Singleton04 {
    private static Singleton04 sSingleton03;
    private Singleton04() {
    }
    public static synchronized Singleton04 getInstance() {
        if (sSingleton03 == null) {
            sSingleton03 = new Singleton04();
        }
        return sSingleton03;
    }
}
