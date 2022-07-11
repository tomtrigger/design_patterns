package com.freedom.chapter_01;

import com.freedom.chapter_01.behavior.impl.FlyRocketPoweredImpl;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("---------------");

        // 玩具鸭在运行中动态改变飞行模式
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPoweredImpl());
        modelDuck.performFly();
    }

}
