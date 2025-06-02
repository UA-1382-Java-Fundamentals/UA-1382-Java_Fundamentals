package Task07.HomeworkTask02;

public abstract class GroundVehicle extends Pasengers implements Vehicle{

    public GroundVehicle(int pasengers) {
        super(pasengers);
    }

    public abstract void drive();
}
