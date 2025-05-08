package com.softserve.academy.homework7.Task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {

        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.printf("The Bus with %d passengers is driving on the route %s. %n",getPassengers(), getRoute());
    }
}
