package com.freedom.chapter_01.behavior.impl;

import com.freedom.chapter_01.behavior.FlyBehavior;

public class FlyNoWayImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不会飞");
    }

}
