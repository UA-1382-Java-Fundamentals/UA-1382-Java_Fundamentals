package com.softserve.academy.edu1.Hw7.Hw2.GroundVehiclePack;

import com.softserve.academy.edu1.Hw7.Hw2.GroundVehicle;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus driving");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
