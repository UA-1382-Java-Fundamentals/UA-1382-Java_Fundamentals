package Task06.HomeworkTask1;

public class Swallow extends FlyingBird{

    protected boolean forkedTail;

    public Swallow(boolean feathers, boolean layEggs, boolean canFly, boolean forkedTail) {
        super(feathers, layEggs, canFly);
        this.forkedTail = forkedTail;
    }

    public String isForkedTail (){
        if(forkedTail == true){
            return "It is a Swallow";
        }
        else{
            return "It is NOT swallow";
        }
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "forkedTail=" + forkedTail +
                ", canFly=" + canFly +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}' ;
    }
}
