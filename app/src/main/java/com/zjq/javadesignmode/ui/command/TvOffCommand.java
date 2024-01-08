package com.zjq.javadesignmode.ui.command;

public class TvOffCommand implements Command {

    private TvReceiver receiver;

    public TvOffCommand(TvReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
