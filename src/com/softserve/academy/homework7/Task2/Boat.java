package softserve.academy.homework7.Task2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.printf("The Boat with %d passengers and %d volume is sailing now. %n",getPassengers(),getVolume());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
