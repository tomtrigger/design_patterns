package com.freedom.chapter_06.macro.command;

import com.freedom.chapter_06.macro.Command;
import com.freedom.chapter_06.obj.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
