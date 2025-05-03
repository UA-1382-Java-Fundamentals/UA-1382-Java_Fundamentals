package softserve.academy.homework6.practicalTask2;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan " +getModel() + " runs at max speed " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " stops.");
    }
    @Override
    public String toString() {
        return  super.toString();
    }
}
