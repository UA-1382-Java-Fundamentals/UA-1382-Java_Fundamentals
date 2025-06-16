package com.softserve.academy.edu1.Hw7.Hw2.WaterVehiclePack;

import com.softserve.academy.edu1.Hw7.Hw2.WaterVehicle;

public class Liner extends WaterVehicle {
    private int floor;

    public Liner(int floor) {
        this.floor = floor;
    }

    @Override
    public void isSailing() {
        System.out.println("The liner is sailing");
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }



}
