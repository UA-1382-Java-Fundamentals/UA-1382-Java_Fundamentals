package softserve.academy.homework5.Task3;

public class Car {
   private String  type;
   private  int yearOfProduction;
   private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction= " + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
