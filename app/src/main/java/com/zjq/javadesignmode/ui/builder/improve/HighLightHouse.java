package com.zjq.javadesignmode.ui.builder.improve;

public class HighLightHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼封顶");
    }
}
