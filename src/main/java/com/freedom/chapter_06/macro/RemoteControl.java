package com.freedom.chapter_06.macro;

import com.freedom.chapter_06.macro.command.NoCommand;

public class RemoteControl {

    private Command[] onCommand;
    private Command[] offCommand;

    private Command undoCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int solt, Command onCommand, Command offCommand) {
        this.onCommand[solt] = onCommand;
        this.offCommand[solt] = offCommand;
    }

    public void buttenOnWasPushed(int solt) {
        onCommand[solt].execute();
        undoCommand = onCommand[solt];
    }

    public void buttenOffWasPushed(int solt) {
        offCommand[solt].execute();
        undoCommand = offCommand[solt];
    }

    public void buttenUndoWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[solt " + i + "] " + onCommand[i].getClass().getName()
                    + "   " + offCommand[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }

}
