package com.softserve.academy.edu1.Hw7.Hw2.WaterVehiclePack;

import com.softserve.academy.edu1.Hw7.Hw2.WaterVehicle;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int volume){
        super();
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is Sailing");
    }



    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
