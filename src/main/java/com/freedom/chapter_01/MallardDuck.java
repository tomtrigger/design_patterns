package com.freedom.chapter_01;

import com.freedom.chapter_01.behavior.impl.FlyWithWingsImpl;
import com.freedom.chapter_01.behavior.impl.QuackImpl;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWingsImpl();
        quackBeHavior = new QuackImpl();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }

}
