package com.zjq.javadesignmode.ui.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        if (index >= mementoList.size()) {
            return null;
        }
        return mementoList.get(index);
    }
}
