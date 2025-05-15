package Task07.HomeworkTask02;

 abstract class WaterVehicle extends Pasengers implements Vehicle{

    public WaterVehicle(int pasengers) {
        super(pasengers);
    }

    public abstract void isSailing();
}
