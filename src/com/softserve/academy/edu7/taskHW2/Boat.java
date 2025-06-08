package softserve.academy.edu7.taskHW2;

class Boat extends WaterVehicle {
    public int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
//        implementation;
    }
}
