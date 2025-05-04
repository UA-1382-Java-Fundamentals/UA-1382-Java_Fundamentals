package hwsixth;

class Swallow extends FlyingBird {
    public Swallow() {
        super("Blue and white feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying fast and gracefully!");
    }
}
