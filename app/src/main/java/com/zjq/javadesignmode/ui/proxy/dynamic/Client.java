package com.zjq.javadesignmode.ui.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
