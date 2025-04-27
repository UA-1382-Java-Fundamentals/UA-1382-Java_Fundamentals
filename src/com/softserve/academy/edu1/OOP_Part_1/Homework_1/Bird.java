package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public abstract class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;

    }

    public String getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public abstract void fly();
}

