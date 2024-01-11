package com.zjq.javadesignmode.ui.observer.improve;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
