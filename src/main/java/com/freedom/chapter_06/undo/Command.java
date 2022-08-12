package com.freedom.chapter_06.undo;

public interface Command {

    void execute();

    void undo();

}
