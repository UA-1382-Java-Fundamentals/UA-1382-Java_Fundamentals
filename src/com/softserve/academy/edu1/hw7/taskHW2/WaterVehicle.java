package softserve.academy.edu1.hw7.taskHW2;

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle (int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
