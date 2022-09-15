package com.freedom.chapter_08.comparable;

/**
 * 我们需要让鸭子类实现 Comparable 接口，因为我们无法真的让鸭子数组去继承数组
 */
public class Duck implements Comparable{

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    /**
     * 我们在这里指定鸭子是如何比较的
     */
    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        return this.weight - duck.getWeight();
    }
}
