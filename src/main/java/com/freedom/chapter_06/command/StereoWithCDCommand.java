package com.freedom.chapter_06.command;

import com.freedom.chapter_06.obj.Stereo;

public class StereoWithCDCommand implements Command{

    private Stereo stereo;

    public StereoWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }
}
