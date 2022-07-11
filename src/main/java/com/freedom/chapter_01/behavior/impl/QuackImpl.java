package com.freedom.chapter_01.behavior.impl;

import com.freedom.chapter_01.behavior.QuackBeHavior;

public class QuackImpl implements QuackBeHavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
