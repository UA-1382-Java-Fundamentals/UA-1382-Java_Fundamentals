package Task07.HomeworkTask02;

public class Bus extends GroundVehicle{

    private String route;

    public Bus(int pasengers, String route) {
        super(pasengers);
        route = this.route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {

    }
}
