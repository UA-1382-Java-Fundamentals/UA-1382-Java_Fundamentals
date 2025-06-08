package softserve.academy.edu7.taskHW2;

class Helicopter extends FlyingVehicle {
    public int maxHeight;
    public int weight;

    public Helicopter(int passengers, int maxHeight, int weight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
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
