package com.zjq.javadesignmode.ui.liskov;

public class Liskov {
    public static void main(String[] args) {

    }
}

class Base {

}

class A extends Base{
    public int func1(int num1, int num2) {
        return num1 + num2;
    }
}

class B extends Base {
    //B类使用A类的方法 使用组合关系
    private A a = new A();
    public int func1(int num1, int num2) {
        return num1 - num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }

    //我们仍然想使用A的方法
    public int func3(int num1, int num2) {
        return a.func1(num1, num2);
    }
}