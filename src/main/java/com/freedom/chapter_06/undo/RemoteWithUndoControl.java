package com.freedom.chapter_06.undo;

public class RemoteWithUndoControl {

    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;

    public RemoteWithUndoControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void onButtenWasPushed(int solt) {
        onCommand[solt].execute();
        undoCommand = offCommand[solt];
    }

    public void offButtenWasPushed(int solt) {
        offCommand[solt].execute();
        undoCommand = onCommand[solt];
    }

    public void undoButtenWasPushed() {
        undoCommand.execute();
    }

    public void setCommand(int solt, Command onCommand, Command offCommand) {
        this.onCommand[solt] = onCommand;
        this.offCommand[solt] = offCommand;
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
