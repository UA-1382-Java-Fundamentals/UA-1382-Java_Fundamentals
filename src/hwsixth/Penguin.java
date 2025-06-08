package hwsixth;

class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Black and white feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly, but they are great swimmers!");
    }
}
