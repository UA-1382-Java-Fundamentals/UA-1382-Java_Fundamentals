package Task06.HomeworkTask1;

public class Kiwi extends NotFlyingBirds{

    protected boolean noTail;

    public Kiwi(boolean feathers, boolean layEggs, boolean haveShortWings, boolean noTail) {
        super(feathers, layEggs, haveShortWings);
        this.noTail = noTail;
    }

    public String isNoTail(){
        if(noTail == true){
            return "This bird is a Kiwi";
        }
        else{
           return  "It is not Kiwi";
        }
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "noTail=" + noTail +
                ", haveShortWings=" + haveShortWings +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
