package com.zjq.javadesignmode.ui.flyweight;

public class ConcreteWebsite extends WebSite {
    private String type = "";//网站发布的形式（类型）

    public ConcreteWebsite(String type) {
        this.type = type;
    }
    @Override
    public void use() {
        System.out.println("网站的发布形式为：" + type + " 在使用中...");
    }
}
