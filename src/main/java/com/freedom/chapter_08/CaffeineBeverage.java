package com.freedom.chapter_08;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Bolling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
