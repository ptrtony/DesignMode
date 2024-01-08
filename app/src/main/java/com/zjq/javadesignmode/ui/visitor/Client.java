package com.zjq.javadesignmode.ui.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());
        Success success = new Success();
        structure.display(success);
    }
}
