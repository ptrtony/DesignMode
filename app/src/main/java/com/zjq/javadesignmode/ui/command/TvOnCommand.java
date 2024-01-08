package com.zjq.javadesignmode.ui.command;

public class TvOnCommand implements Command {

    private TvReceiver receiver;

    public TvOnCommand(TvReceiver receiver) {
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
