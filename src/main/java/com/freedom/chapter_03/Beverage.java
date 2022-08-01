package com.freedom.chapter_03;

public abstract class Beverage {

    public static final String TALL = "tall";
    public static final String GRANDE = "grande";
    public static final String VENTI = "venti";

    public String description = "Unknown Beverage";

    public String size = "Unknow Size";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public abstract String getSize();

    public abstract String setSzie(String size);

}
