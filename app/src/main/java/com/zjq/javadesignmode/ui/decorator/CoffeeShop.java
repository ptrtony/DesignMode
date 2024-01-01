package com.zjq.javadesignmode.ui.decorator;

public class CoffeeShop {

    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.getPrice());
        System.out.println("描述1=" + order.getDesc());

        //加入一份chocolate
        order = new Chocolate(order);
        System.out.println("费用2=" + order.getPrice());
        System.out.println("描述2=" + order.getDesc());

        //加入一份Milk
        order = new Milk(order);
        System.out.println("费用2=" + order.getPrice());
        System.out.println("描述2=" + order.getDesc());
    }
}
