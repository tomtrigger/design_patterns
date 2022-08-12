package com.freedom.chapter_06.undo;

import com.freedom.chapter_06.obj.Light;

public class RemoteWithUndoControlTest {

    public static void main(String[] args) {
        RemoteWithUndoControl control = new RemoteWithUndoControl();

        Light light = new Light("living room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        control.setCommand(0, lightOnCommand, lightOffCommand);

        control.onButtenWasPushed(0);
        control.offButtenWasPushed(0);
        System.out.println(control);
        control.undoButtenWasPushed();
        control.onButtenWasPushed(0);
        control.offButtenWasPushed(0);
        System.out.println(control);
        control.undoButtenWasPushed();
    }

}
