package Task07.HomeworkTask02;

public class Helicopter extends FlyingVehicle {

    private int weight;
    private int maxHeight;

    public Helicopter(int pasengers,int weight,int maxHeight) {
        super(pasengers);
        weight = this.weight;
        maxHeight = this.maxHeight;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
