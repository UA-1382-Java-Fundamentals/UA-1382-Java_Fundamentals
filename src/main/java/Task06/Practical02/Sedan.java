package Task06.Practical02;

public class  Sedan extends Cars {

    private String fuel;
    private boolean cabrio;

    public Sedan( String model, int maxSpeed, int yearOfProduction,String fuel, boolean cabrio) {
        super( model,maxSpeed,yearOfProduction);
        this.fuel = fuel;
        this.cabrio = cabrio;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isCabrio() {
        return cabrio;
    }

    public void setCabrio(boolean cabrio) {
        this.cabrio = cabrio;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" +  model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                ", fuel='" + fuel + '\'' +
                ", cabrio=" + cabrio +
                '}';
    }
}
