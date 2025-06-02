package Task06.Practical02;

public class Truck extends Cars{

    private double capacity;
    private boolean withTrailer;

    public Truck(String model, int maxSpeed, int yearOfProduction,double capacity, boolean withTrailer) {
        super(model,maxSpeed,yearOfProduction);
        this.capacity = capacity;
        this.withTrailer = withTrailer;
    }

    public Truck() {
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isWithTrailer() {
        return withTrailer;
    }

    public void setWithTrailer(boolean withTrailer) {
        this.withTrailer = withTrailer;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                ", capacity=" + capacity +
                ", withTrailer=" + withTrailer +
                '}';
    }
}
