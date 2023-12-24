package com.zjq.javadesignmode.ui.interface_segregation_principle;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend3(new B());
    }
}
interface Interface1 {
    void operate1();
    void operate2();
    void operate3();
    void operate4();
    void operate5();
}

class B implements Interface1{
    @Override
    public void operate1() {
        System.out.println("B 中实现了operate1");
    }

    @Override
    public void operate2() {
        System.out.println("B 中实现了operate2");
    }

    @Override
    public void operate3() {
        System.out.println("B 中实现了operate3");
    }

    @Override
    public void operate4() {
        System.out.println("B 中实现了operate4");
    }

    @Override
    public void operate5() {
        System.out.println("B 中实现了operate5");
    }
}

class A {
    //A类通过接口Interface1依赖（使用）B类，但是只会用到1，2，3方法
    public void depend1(Interface1 i) {
        i.operate1();
    }
    public void depend2(Interface1 i) {
        i.operate2();
    }
    public void depend3(Interface1 i) {
        i.operate3();
    }
    public void depend4(Interface1 i) {
        i.operate4();
    }
    public void depend5(Interface1 i) {
        i.operate5();
    }
}