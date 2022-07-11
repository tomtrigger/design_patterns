package com.freedom.chapter_01;

import com.freedom.chapter_01.behavior.impl.FlyNoWayImpl;
import com.freedom.chapter_01.behavior.impl.QuackImpl;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWayImpl();
        quackBeHavior = new QuackImpl();
    }

    @Override
    public void display() {
        System.out.println("我是一直玩具鸭");
    }
}
