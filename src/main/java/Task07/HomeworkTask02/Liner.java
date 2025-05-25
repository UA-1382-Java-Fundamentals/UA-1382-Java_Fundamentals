package Task07.HomeworkTask02;

public class Liner extends WaterVehicle{

    private int floors;

    public Liner(int pasengers, int floors) {
        super(pasengers);
        floors = this.floors;
    }

    public void isSailing(){

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
