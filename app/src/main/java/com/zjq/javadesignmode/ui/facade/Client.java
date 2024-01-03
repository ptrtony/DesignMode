package com.zjq.javadesignmode.ui.facade;

public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        facade.play();
        facade.pause();
        facade.end();
    }
}
