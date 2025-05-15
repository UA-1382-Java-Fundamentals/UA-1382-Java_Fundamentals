package Task07.HomeworkTask02;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    public Motorcycle(int pasengers,int maxSpeed) {
        super(pasengers);
        maxSpeed = this.maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {

    }
}
