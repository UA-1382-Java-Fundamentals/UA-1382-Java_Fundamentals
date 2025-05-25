package Task06.HomeworkTask1;

public class Penquin extends NotFlyingBirds{

    protected boolean canSwim;

    public Penquin(boolean feathers, boolean layEggs, boolean haveShortWings, boolean canSwim) {
        super(feathers, layEggs, haveShortWings);
        this.canSwim = canSwim;
    }

    public String isCanSwim(){
        if(canSwim == true && feathers == false){
            return "It is a Penquin";
        }
        else {
            return "It is NOT a Penquin";
        }
    }

    @Override
    public String toString() {
        return "Penquin{" +
                "canSwim=" + canSwim +
                ", haveShortWings=" + haveShortWings +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
