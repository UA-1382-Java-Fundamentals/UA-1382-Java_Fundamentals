package softserve.academy.homework7.Task2;

public class Car extends GroundVehicle{
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.printf("The car %s is driving %n ",getModel());
    }
}
