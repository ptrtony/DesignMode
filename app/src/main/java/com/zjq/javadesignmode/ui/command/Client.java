package com.zjq.javadesignmode.ui.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("-----------------按下灯的开的按钮------------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----------------按下灯的关的按钮------------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----------------按下灯的开的按钮------------------");
        remoteController.undoBottomWasPushed();
        TvReceiver tvReceiver = new TvReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("-----------------按下电视的开的按钮------------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----------------按下电视的关的按钮------------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----------------按下电视的开的按钮------------------");
        remoteController.undoBottomWasPushed();
    }
}
