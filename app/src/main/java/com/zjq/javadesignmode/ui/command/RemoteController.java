package com.zjq.javadesignmode.ui.command;

public class RemoteController {
    //开 按钮的命令数组
    Command onCommand[];
    Command offCommand[];
    Command undoCommand;

    public RemoteController() {
        onCommand = new Command[5];
        offCommand = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommand[i] = new NoCommand();
        }

        for (int i = 0; i < 5; i++) {
            offCommand[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        this.onCommand[no] = onCommand;
        this.offCommand[no] = offCommand;
    }

    public void onButtonWasPushed(int no) {
        onCommand[no].execute();
        undoCommand = offCommand[no];
    }

    public void offButtonWasPushed(int no) {
        offCommand[no].execute();
        undoCommand = offCommand[no];
    }
    public void undoBottomWasPushed() {
        undoCommand.undo();
    }
}
