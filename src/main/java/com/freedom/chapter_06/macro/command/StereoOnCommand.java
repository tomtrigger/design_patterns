package com.freedom.chapter_06.macro.command;

import com.freedom.chapter_06.macro.Command;
import com.freedom.chapter_06.obj.Stereo;

public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
