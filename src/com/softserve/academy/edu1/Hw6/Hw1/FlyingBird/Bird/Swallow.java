package com.softserve.academy.edu1.Hw6.Hw1.FlyingBird.Bird;

import com.softserve.academy.edu1.Hw6.Hw1.FlyingBird.FlyingBird;

public class Swallow extends FlyingBird {
    public String type = "Swallow";
    public int longToLive = 5;

    public Swallow() {
        super();
    }
    @Override
    public String fly() {
        return super.fly();
    }

    @Override
    public void info(){
        System.out.println(toString()+fly());
    }

    @Override
    public String toString() {
        return "Info of: "+getType() + "\nHow long they live:  " + getLongToLive();
    }

    public String getType() {
        return type;
    }

    public int getLongToLive() {
        return longToLive;
    }
}
