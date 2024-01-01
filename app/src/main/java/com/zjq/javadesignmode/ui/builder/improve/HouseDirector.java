package com.zjq.javadesignmode.ui.builder.improve;


//指挥者，这里是制作流程
public class HouseDirector {

    HouseBuilder houseBuilder;
    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //通过setter 传入houseBuilder

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
