package com.freedom.chapter_01.behavior.impl;

import com.freedom.chapter_01.behavior.FlyBehavior;

public class FlyRocketPoweredImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我用火箭飞行!");
    }

}
