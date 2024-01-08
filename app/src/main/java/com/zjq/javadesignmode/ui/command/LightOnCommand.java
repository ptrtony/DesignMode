package com.zjq.javadesignmode.ui.command;

public class LightOnCommand implements Command {
    private LightReceiver receiver;
    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
