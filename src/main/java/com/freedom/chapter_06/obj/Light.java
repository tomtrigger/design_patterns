package com.freedom.chapter_06.obj;

public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("打开灯");
    }

    public void off() {
        System.out.println("关闭灯");
    }

}
