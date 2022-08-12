package com.freedom.chapter_06.command;

import com.freedom.chapter_06.obj.CeilingFan;

public class CeilingFanOnCommand implements Command{


    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.medium();
    }

}
