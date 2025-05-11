package com.softserve.academy.homework10.practicalTask1;

public class HeavyBox {
     int weight;
     String name;

    public HeavyBox(int weight, String name) {
        this.weight = weight;
        this.name = name;
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
        return "HeavyBox{" +
                "weight = " + weight +
                ", name = '" + name + '\'' +
                '}';
    }
}
