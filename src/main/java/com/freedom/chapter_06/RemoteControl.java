package com.freedom.chapter_06;

import com.freedom.chapter_06.command.Command;
import com.freedom.chapter_06.command.NoCommand;

public class RemoteControl {

    private Command[] onCommand;
    private Command[] offCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int solt, Command onCommand, Command offCommand) {
        this.onCommand[solt] = onCommand;
        this.offCommand[solt] = offCommand;
    }

    public void onButtonWasPushed(int solt) {
        this.onCommand[solt].execute();
    }

    public void offButtonWasPushed(int solt) {
        this.offCommand[solt].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[solt " + i + "] " + onCommand[i].getClass().getName()
                    + "   " + offCommand[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
