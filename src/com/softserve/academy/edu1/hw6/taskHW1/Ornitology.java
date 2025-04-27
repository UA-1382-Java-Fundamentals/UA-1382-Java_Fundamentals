package softserve.academy.edu1.hw6.taskHW1;

abstract class Bird {
    protected String feathers;
    protected int layEggs;
    protected String type;

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public void fly() {
        System.out.println("Flying high and steady.");
    }
}

class FlyingBird extends Bird {
    protected int flySpeed;

    public FlyingBird(String feathers, int layEggs, int flySpeed) {
        super(feathers, layEggs);
        this.flySpeed = flySpeed;
    }
}

class NonFlyingBird extends Bird {
    protected int runSpeed;

    public NonFlyingBird(String feathers, int layEggs, int runSpeed) {
        super(feathers, layEggs);
        this.runSpeed = runSpeed;
    }

    @Override
    public void fly() {
        System.out.println("It doesn't fly. But it can run at " + runSpeed + " km/h!");
    }
}

class Eagle extends FlyingBird {
    public Eagle(String feathers, int layEggs, int flySpeed) {
        super(feathers, layEggs, flySpeed);
        this.type = "Eagle";
    }
}

class Swallow extends FlyingBird {
    public Swallow(String feathers, int layEggs, int flySpeed) {
        super(feathers, layEggs, flySpeed);
        this.type = "Swallow";
    }

    @Override
    public void fly() {
        System.out.println("Swallows fly low and fast!");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin(String feathers, int layEggs, int runSpeed) {
        super(feathers, layEggs, runSpeed);
        this.type = "Penguin";
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, int layEggs, int runSpeed) {
        super(feathers, layEggs, runSpeed);
        this.type = "Kiwi";
    }

    @Override
    public void fly() {
        System.out.println("Unfortunately, " + type + " don't fly or run - they are extinct.");
    }
}

public class Ornitology {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Brown-white", 3, 100),
                new Eagle("Black-grey-white", 5, 100),
                new Swallow("Black-white", 10, 80),
                new Swallow("Black-blue-white", 13, 85),
                new Swallow("Blue-green-white", 15, 70),
                new Kiwi("Brown-grey", 2, 30),
                new Penguin("Black-yellow-white", 3, 20),
                new Penguin("Black-yellow-red-white", 2, 20)
        };
        for (Bird bird : birds) {
            System.out.println(bird.feathers + " " + bird.type + " lays " + bird.layEggs + " eggs.");
            bird.fly();
            System.out.println("-----------------------------------------------");
        }
    }
}
