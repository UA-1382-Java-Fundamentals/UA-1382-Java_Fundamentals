package com.softserve.academy.edu1.Hw7.Hw2.FlyingVehiclePack;

import com.softserve.academy.edu1.Hw7.Hw2.FlyingVehicle;

public class Plane extends FlyingVehicle {
    private int maxDistance;


    public Plane(int maxDistance) {
        super();
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly(){
        System.out.println("Plane flying");
    }

    @Override
    public void land(){
        System.out.println("Plane landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }
    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

}
