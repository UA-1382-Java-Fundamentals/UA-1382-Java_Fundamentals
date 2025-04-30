package softserve.academy.edu1.hw7.taskHW2;

class Bus extends GroundVehicle {
    public String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
//        implementation;
    }
}
