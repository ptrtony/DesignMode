package com.zjq.javadesignmode.ui.flyweight;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        WebSite website = factory.getWebsiteCategory("新闻");
        website.use();
    }
}
