package Task07.HomeworkTask02;

public abstract class FlyingVehicle extends Pasengers implements Vehicle{

    public FlyingVehicle(int pasengers) {
        super(pasengers);
    }

    public abstract void fly();

    public abstract void land();
}
