package com.softserve.academy.hw6_t1;

public abstract class Bird {
    private final String type;
    private final boolean feathers;
    private final boolean layEggs;

    public String getType() {
        return type;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public Bird(String type, boolean feathers, boolean layEggs) {
        this.type = type;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}

