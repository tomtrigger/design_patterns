package com.freedom.chapter_06.macro.command;

import com.freedom.chapter_06.macro.Command;
import com.freedom.chapter_06.obj.Hottub;

public class HottubOnCommand implements Command {

    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.jetsOn();
    }

    @Override
    public void undo() {
        hottub.off();
        hottub.jetsOff();
    }
}
