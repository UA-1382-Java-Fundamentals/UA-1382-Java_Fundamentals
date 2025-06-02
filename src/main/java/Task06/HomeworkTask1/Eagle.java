package Task06.HomeworkTask1;

public class Eagle extends FlyingBird {

    protected boolean haveClaws;

    public Eagle(boolean feathers, boolean layEggs, boolean canFly, boolean haveClaws) {
        super(feathers, layEggs, canFly);
        this.haveClaws = haveClaws;
    }

    public String clowdsCheck (){
        if(haveClaws == true){
            return "Its a Eagle!";
        }
        else {
            return "Its NOT Eagle";
        }
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "haveClaws=" + haveClaws +
                ", canFly=" + canFly +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
