package com.zjq.javadesignmode.ui.dependence_inversion_principle;

public class DependencyInversion {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }
}

class Email implements IReceiver{
    public String getInfo() {
        return "电子邮件信息是:hello world";
    }
}

class Wechat implements IReceiver {

    @Override
    public String getInfo() {
        return "Wechat消息是:Hello china";
    }
}

interface IReceiver {
    String getInfo();
}

//完成Person接收消息的功能
//
class Person {
    public void receive(IReceiver e) {
        System.out.println(e.getInfo());
    }
}
