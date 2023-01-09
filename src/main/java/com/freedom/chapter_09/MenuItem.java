package com.freedom.chapter_09;

public class MenuItem {

    String name;
    String description;
    boolean vegetatian;
    double price;

    public MenuItem(String name, String description, boolean vegetatian, double price) {
        this.name = name;
        this.description = description;
        this.vegetatian = vegetatian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetatian() {
        return vegetatian;
    }

    public double getPrice() {
        return price;
    }
}
