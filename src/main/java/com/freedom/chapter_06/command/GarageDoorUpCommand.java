package com.freedom.chapter_06.command;

import com.freedom.chapter_06.obj.GarageDoor;

public class GarageDoorUpCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
