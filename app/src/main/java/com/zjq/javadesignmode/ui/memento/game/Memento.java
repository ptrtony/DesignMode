package com.zjq.javadesignmode.ui.memento.game;

public class Memento {
    private String vit;
    private String def;

    public Memento(String vit, String def) {
        this.vit = vit;
        this.def = def;
    }

    public String getVit() {
        return vit;
    }

    public void setVit(String vit) {
        this.vit = vit;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
