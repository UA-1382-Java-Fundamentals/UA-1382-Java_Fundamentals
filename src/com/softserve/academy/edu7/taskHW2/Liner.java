package softserve.academy.edu7.taskHW2;

class Liner extends WaterVehicle {
    public int floors;

    public Liner (int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {
//        implementation;
    }
}
