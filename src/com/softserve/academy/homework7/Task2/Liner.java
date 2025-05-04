package softserve.academy.homework7.Task2;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.printf("The Liner is sailing with %d passengers and %d floors. %n",getPassengers(),getFloors());
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
