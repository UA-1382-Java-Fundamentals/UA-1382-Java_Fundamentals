package Task06.HomeworkTask1;

public class NotFlyingBirds extends Bird{

    protected boolean haveShortWings;

    public NotFlyingBirds(boolean feathers, boolean layEggs, boolean haveShortWings) {
        super(feathers, layEggs);
        this.haveShortWings = haveShortWings;
    }

   @Override
    public String fly(){

        if(feathers == true && haveShortWings == true){
           return  "This bird have a feathers, but can't fly because have a short wings ";
        }
       else{
          return   "This bird have big wings but cant fly";
        }
    }

    @Override
    public String toString() {
        return "NotFlyingBirds{" +
                "haveShortWings=" + haveShortWings +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
