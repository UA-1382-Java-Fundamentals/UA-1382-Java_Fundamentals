package softserve.academy.edu4.taskHW5;



public class DogBreeding {
    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog("Spot", "Bulldog", 15),
                new Dog("Fluffy", "Poodle", 3),
                new Dog("Black", "Shepherd", 7),
                new Dog("Ginger", "Husky", 8),
                new Dog(null, "Malamute", 0),
        };

        System.out.println("Add credentials of the last dog:");
        while (true) {
            try {
                dogs[dogs.length-1] = Dog.inputNewDog();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Here is list of dogs: ");
        System.out.println("----------------------");
        for (Dog d : dogs) {
            System.out.println(d.toString());
        }
        System.out.println("----------------------");

        if (Dog.isNameUnique(dogs)) {
            System.out.println("All dogs' names are unique!");
        } else {
            System.out.println("Some dogs have the duplicate names!");
        }
        System.out.println("----------------------");

        Dog eldestDog = Dog.getEldestDog(dogs);
        System.out.printf("The eldest dog is %s\n", eldestDog.toString());
        System.out.println("----------------------");

    }
}
