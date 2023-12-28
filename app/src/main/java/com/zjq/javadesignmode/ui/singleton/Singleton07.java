package com.zjq.javadesignmode.ui.singleton;

public class Singleton07 {

    private Singleton07() {

    }
    private static class Singleton07Instance {
        private static Singleton07 INSTANCE = new Singleton07();
    }

    public static synchronized Singleton07 getInstance() {
        return Singleton07Instance.INSTANCE;
    }
}
