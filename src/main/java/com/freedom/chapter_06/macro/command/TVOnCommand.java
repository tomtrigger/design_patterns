package com.freedom.chapter_06.macro.command;

import com.freedom.chapter_06.macro.Command;
import com.freedom.chapter_06.obj.TV;

public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
