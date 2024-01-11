package com.zjq.javadesignmode.ui.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态#1 攻击力100");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态#2 攻击力80");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态#2 攻击力50");
        caretaker.add(originator.saveStateMemento());
        originator.getStateFromMemento(caretaker.get(0));
    }
}
