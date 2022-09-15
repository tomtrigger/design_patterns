package com.freedom.chapter_08.hook;

public class HookTest {

    public static void main(String[] args) {
        CaffeineBeverageWithHook hook = new CoffeeWithHook();
        hook.prepareRecipe();
    }

}
