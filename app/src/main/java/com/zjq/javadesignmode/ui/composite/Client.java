package com.zjq.javadesignmode.ui.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级的大学");
        OrganizationComponent collage1 = new Collage("计算机学院", "计算机学院");
        OrganizationComponent collage2 = new Collage("信息工程学院", "信息工程学院");
        collage1.add(new Department("软件工程", "软件工程不错"));
        collage1.add(new Department("网络工程", "网络工程不错"));
        collage1.add(new Department("计算机科学与技术", "计算机科学与技术"));
        collage2.add(new Department("通信工程", "通信工程"));
        collage2.add(new Department("信息工程", "信息工程"));
        university.add(collage1);
        university.add(collage2);

        university.print();
    }
}
