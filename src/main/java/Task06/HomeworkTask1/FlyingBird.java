package Task06.HomeworkTask1;

public class FlyingBird extends Bird {

    protected boolean canFly;

    public FlyingBird(boolean feathers, boolean layEggs, boolean canFly) {
        super(feathers, layEggs);
        this.canFly = canFly;
    }

    @Override
    public String fly() {
        if (canFly == true) {
           return  "This bird can fly";
        } else {
            return "This bird can NOT fly";

        }
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "canFly=" + canFly +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
