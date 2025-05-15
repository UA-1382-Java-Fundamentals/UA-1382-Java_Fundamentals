package Task07.HomeworkTask02;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane(int pasengers, int maxDistance) {
        super(pasengers);
        maxDistance = this.maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
    }

    @Override
    public void land() {
    }
}
