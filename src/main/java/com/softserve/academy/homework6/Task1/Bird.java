package com.softserve.academy.homework6.Task1;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    private boolean canFly;
    protected String type;

    public Bird(boolean feathers, boolean layEggs, boolean canFly, String type) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.canFly = canFly;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean canLayEggs() {
        return layEggs;
    }

    public abstract void fly();

    public void printInfo(){
        System.out.println("Type: " + type + ", Feathers: " + feathers + ", Lays eggs " + layEggs);
    }
}
