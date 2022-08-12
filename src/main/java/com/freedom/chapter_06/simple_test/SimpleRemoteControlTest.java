package com.freedom.chapter_06.simple_test;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        simpleRemoteControl.setCommand(new LightOnCommand(light));
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(new GarageDoorCommand(garageDoor));
        simpleRemoteControl.buttonWasPressed();
    }

}
