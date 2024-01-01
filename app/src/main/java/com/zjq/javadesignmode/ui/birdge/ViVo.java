package com.zjq.javadesignmode.ui.birdge;

public class ViVo implements Brand {
    @Override
    public void open() {
        System.out.println("ViVo手机开机");
    }

    @Override
    public void close() {
        System.out.println("ViVo手机关机");
    }

    @Override
    public void call() {
        System.out.println("ViVo手机打电话");
    }
}
