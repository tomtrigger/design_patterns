package com.freedom.chapter_06.command;

import com.freedom.chapter_06.obj.GarageDoor;

public class GarageDoorDownCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
