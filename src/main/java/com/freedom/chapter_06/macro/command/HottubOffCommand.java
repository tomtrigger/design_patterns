package com.freedom.chapter_06.macro.command;

import com.freedom.chapter_06.macro.Command;
import com.freedom.chapter_06.obj.Hottub;

public class HottubOffCommand implements Command {

    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.on();
        hottub.jetsOn();
    }
}
