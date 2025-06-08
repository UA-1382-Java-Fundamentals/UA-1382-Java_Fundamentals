package softserve.academy.edu7.taskHW2;

class Car extends GroundVehicle {
    public String model;

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
//        implementation;
    }
}
