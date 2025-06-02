package Task07.HomeworkTask02;

public class Car extends GroundVehicle{

    private String model;

    public Car(int pasengers,String model) {
        super(pasengers);
        model = this.model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {

    }
}
