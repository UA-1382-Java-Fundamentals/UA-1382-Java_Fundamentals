package hwsixth;

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Brown feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi cannot fly, but is a great runner!");
    }
}
