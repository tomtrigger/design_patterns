package com.freedom.chapter_08.hook;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // 加上一个小小的条件语句，而该条件是否成立，是由一个具体方法
        // customerWantsCondiments() 决定的。如果顾客“想要”调料，只有这时
        // 我们才调用addCondiments()
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Bolling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 我们在这里定义一个方法，一般是空的缺省实现。这个方法
     * 只会返回true，不做别的事
     *
     * 这其实就是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做。
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }

}
