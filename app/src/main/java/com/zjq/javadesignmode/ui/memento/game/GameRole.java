package com.zjq.javadesignmode.ui.memento.game;

public class GameRole {

    private String vit;
    private String def;

    public Memento createMemento() {
        return new Memento(vit, def);
    }

    public void recoverGameRoleMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + "防御力：" + this.def);
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
