package com.zjq.javadesignmode.ui.template;

public class PureSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        //do nothing
    }

    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
