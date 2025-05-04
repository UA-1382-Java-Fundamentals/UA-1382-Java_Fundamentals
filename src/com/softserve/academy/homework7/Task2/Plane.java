package softserve.academy.homework7.Task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.printf("The Plane with %d passengers on boar is flying now. %n",getPassengers());
    }

    @Override
    public void land() {
        System.out.printf("The Plane landed with max distance %d. %n",getMaxDistance());
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
