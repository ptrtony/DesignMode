package com.zjq.javadesignmode.ui.singleResposibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.roadRun("跑车");
        vehicle.airRun("飞机");
        vehicle.waterRun("轮船");
    }
}

//没有在类中进行单一职责，但是在方法中进行了单一职责
class Vehicle2 {
    public void roadRun(String vehicle) {
        System.out.print(vehicle + "在公路上跑");
    }

    public void airRun(String vehicle) {
        System.out.println(vehicle + "在空中飞");
    }

    public void waterRun(String vehicle) {
        System.out.println(vehicle + "在水中跑");
    }
}
