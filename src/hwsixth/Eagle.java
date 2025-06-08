package hwsixth;

class Eagle extends FlyingBird {
    public Eagle() {
        super("Brown feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky!");
    }
}
