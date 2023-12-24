package com.zjq.javadesignmode.ui.interface_segregation_principle;

public class Segregation2 {
    public static void main(String[] args) {
        F f = new F();
        f.operate1(new C());
        f.operate4(new E());
        f.operate5(new E());
    }
}

interface Interface2 {
    void operate1();
}

interface Interface3 {
    void operate2();
    void operate3();
}
interface Interface4 {
    void operate4();
    void operate5();
}

class C implements Interface2, Interface3{

    @Override
    public void operate1() {
        System.out.println("C 实现了operate1");
    }

    @Override
    public void operate2() {
        System.out.println("C 实现了operate2");
    }

    @Override
    public void operate3() {
        System.out.println("C 实现了operate3");
    }
}

class D implements Interface2,Interface4 {

    @Override
    public void operate1() {
        System.out.println("D 实现了operate1");
    }

    @Override
    public void operate4() {
        System.out.println("D 实现了operate4");
    }

    @Override
    public void operate5() {
        System.out.println("D 实现了operate5");
    }
}

class E implements Interface4 {

    @Override
    public void operate4() {
        System.out.println("E 实现了operate4");
    }

    @Override
    public void operate5() {
        System.out.println("E 实现了operate5");
    }
}

class F {
    public void operate1(Interface2 i) {
        i.operate1();
    }
    public void operate2(Interface3 i) {
        i.operate2();
    }
    public void operate3(Interface3 i) {
        i.operate3();
    }
    public void operate4(Interface4 i) {
        i.operate4();
    }
    public void operate5(Interface4 i) {
        i.operate5();
    }
}
