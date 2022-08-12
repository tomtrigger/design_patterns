package com.freedom.chapter_06.macro;

import com.freedom.chapter_06.macro.command.*;
import com.freedom.chapter_06.obj.Hottub;
import com.freedom.chapter_06.obj.Light;
import com.freedom.chapter_06.obj.Stereo;
import com.freedom.chapter_06.obj.TV;

public class RemoteControlTest {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Hottub hottub = new Hottub();
        Light light = new Light("living room");
        Stereo stereo = new Stereo("living room");
        TV tv = new TV("living room");

        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        Command[] onCommands = new Command[]{hottubOnCommand, lightOnCommand, stereoOnCommand, tvOnCommand};
        Command[] offCommands = new Command[]{hottubOffCommand, lightOffCommand, stereoOffCommand, tvOffCommand};

        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        remoteControl.setCommand(0, onMacroCommand, offMacroCommand);

        System.out.println(remoteControl);
        System.out.println("--- pushing macro on ---");
        remoteControl.buttenOnWasPushed(0);
        System.out.println("--- pushing macro off ---");
        remoteControl.buttenOffWasPushed(0);

        System.out.println("---- undo ----");
        System.out.println(remoteControl);
        remoteControl.buttenUndoWasPushed();
    }

}
