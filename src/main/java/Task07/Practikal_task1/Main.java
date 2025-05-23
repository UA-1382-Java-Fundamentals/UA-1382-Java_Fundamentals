package Task07.Practikal_task1;

public class Main {

    public static void main (String[] args){

         Animal[] animals = {
                 new Cat("Joe"),
                 new Cat("Tom"),
                 new Dog("Bady"),
                 new Dog("Jack")
         };

         for (Animal anim : animals){
             anim.voise();
             anim.feed();
         }
    }
}
