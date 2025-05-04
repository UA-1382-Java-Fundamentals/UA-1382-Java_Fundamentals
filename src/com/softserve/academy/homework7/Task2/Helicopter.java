package softserve.academy.homework7.Task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.printf("The Helicopter with %d passengers is flying now. %n",getPassengers());
    }

    @Override
    public void land() {
        System.out.println("The Helicopter landed");
    }
}
