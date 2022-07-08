package com.freedom.chapter_01;

import com.freedom.chapter_01.behavior.FlyBehavior;
import com.freedom.chapter_01.behavior.QuackBeHavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBeHavior quackBeHavior;

/*    public void quack() {
        System.out.println("嘎嘎嘎。。。");
    }*/

    public void swim() {
        System.out.println("游游游。。。");
    }

/*    public void fly() {
        System.out.println("飞飞飞。。");
    }*/

    public void performQuack() {
        quackBeHavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

}
