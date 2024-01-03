package com.zjq.javadesignmode.ui.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
    //集合，充当池的作用
    private HashMap<String, WebSite> pool = new HashMap<>();

    public WebSite getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public int getWebsiteCount() {
        return pool.size();
    }
}
