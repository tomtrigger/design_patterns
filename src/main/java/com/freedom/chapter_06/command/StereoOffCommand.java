package com.freedom.chapter_06.command;

import com.freedom.chapter_06.obj.Stereo;

public class StereoOffCommand implements Command{

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
