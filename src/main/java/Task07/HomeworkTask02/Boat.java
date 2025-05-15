package Task07.HomeworkTask02;

public class Boat extends WaterVehicle {

    private int volume;

    public Boat(int pasengers, int volume) {
        super(pasengers);
        volume = this.volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void isSailing(){}
}
