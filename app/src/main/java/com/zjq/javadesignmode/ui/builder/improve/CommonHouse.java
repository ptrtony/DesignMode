package com.zjq.javadesignmode.ui.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("给普通房子封顶");
    }
}
