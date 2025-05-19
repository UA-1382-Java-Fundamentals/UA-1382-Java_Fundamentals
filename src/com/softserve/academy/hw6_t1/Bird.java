package com.softserve.academy.hw6_t1;

public abstract class Bird {
    protected final String type;
    protected final boolean feathers;
    protected final boolean layEggs;

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

