package com.freedom.chapter_05;

public class Singleton {

    private volatile static Singleton uniqueInstance = null;

    private Singleton() {};

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
