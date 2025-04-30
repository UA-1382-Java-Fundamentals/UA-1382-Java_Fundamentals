package softserve.academy.edu1.hw7.taskHW2;

class Plane extends FlyingVehicle {
    public int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
//        implementation;
    }

    @Override
    void land() {
//        implementation;
    }
}
