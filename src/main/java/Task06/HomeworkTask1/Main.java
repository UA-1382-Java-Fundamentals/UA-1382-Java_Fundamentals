package Task06.HomeworkTask1;

public class Main {

    public static void main (String[] args){

       Bird[] birdsArray = {
               new Eagle(true,true,true,true),
               new Kiwi(true,true,true,true),
               new Penquin(false,true,true,true),
               new Swallow(true,true,true,true),
               new FlyingBird(true,true,false),
               new NotFlyingBirds(true,true,true)
       };

       for(int i = 0; i<= birdsArray.length-1;i++){
              System.out.println(birdsArray[i].toString());
              System.out.println(birdsArray[i].fly());

           if (birdsArray[i].getClass().equals(Kiwi.class)){
             System.out.println(((Kiwi) birdsArray[i]).isNoTail());
           }

           if (birdsArray[i].getClass().equals(Eagle.class)){
               System.out.println(((Eagle) birdsArray[i]).clowdsCheck());
           }

           if (birdsArray[i].getClass().equals(Swallow.class)){
               System.out.println(((Swallow) birdsArray[i]).isForkedTail());
           }

           if (birdsArray[i].getClass().equals(Penquin.class)){
               System.out.println(((Penquin) birdsArray[i]).isCanSwim());
           }
           System.out.println("--------------------------------");
       }
    }
}
