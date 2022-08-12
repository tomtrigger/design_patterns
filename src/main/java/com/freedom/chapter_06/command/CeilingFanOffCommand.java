package com.freedom.chapter_06.command;

import com.freedom.chapter_06.obj.CeilingFan;

public class CeilingFanOffCommand implements Command{

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
