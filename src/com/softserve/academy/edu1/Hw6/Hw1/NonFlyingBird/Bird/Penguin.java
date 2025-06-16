package com.softserve.academy.edu1.Hw6.Hw1.NonFlyingBird.Bird;

import com.softserve.academy.edu1.Hw6.Hw1.NonFlyingBird.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    public String type = "Penguin";
    public int longToLive = 15;

    public Penguin() {
        super();
        fly();
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
