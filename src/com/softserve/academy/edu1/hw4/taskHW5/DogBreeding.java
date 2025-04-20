package softserve.academy.edu1.hw4.taskHW5;

import java.util.Objects;

enum Breed {
    SHEPHERD("Shepherd"),
    BULLDOG("Bulldog"),
    LABRADOR("Labrador"),
    HUSKY("Husky"),
    BEAGLE("Beagle"),
    MALAMUTE("Malamute"),
    POODLE("Poodle"),
    CHIHUAHUA("Chihuahua"),
    DACHSHUND("Dachshund"),
    UNKNOWN("Unknown");

    private final String label;

    private Breed(String label) {
        this.label = label;
    }

    public static Breed matchBreed(String label) {
        for (Breed breedInstance : values()) {
            if (breedInstance.label.equals(label)) {
                return breedInstance;
            }
        }
        return null;
    }

    public String getLabel() {
        return label;
    }
}

class Dog {
    private final String name;
    private final Breed breed;
    private final int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.age = age;
        Breed breedInstance = Breed.matchBreed(breed);
        if (breedInstance != null) {
            this.breed = breedInstance;
        }
        else {
            this.breed = Breed.UNKNOWN;
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed.getLabel();
    }

    public int getAge() {
        return age;
    }

    public static boolean isNameUnique(Dog... dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                if (j != i) {
                    if (dogs[i].getName().equals(dogs[j].getName())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static Dog getEldestDog (Dog... dogs) {
        Dog eldestDog = new Dog("NoName", "Unknown", 0);
        for (Dog dog : dogs) {
            if (dog.getAge() >= eldestDog.getAge()) {
                eldestDog = dog;
            }
        }
        return eldestDog;
    }
}

public class DogBreeding {
    public static void main(String[] args) {
        Dog dogA = new Dog("Spot", "Bulldog", 15);
        Dog dogB = new Dog("Fluffy", "Poodle", 3);
        Dog dogC = new Dog("Black", "Shepherd", 7);

        boolean isDogNameUnique = Dog.isNameUnique(dogA, dogB, dogC);
        String messageUniqueNames;
        if (isDogNameUnique) {
            messageUniqueNames = "All dogs' names are unique!";
        }
        else {
            messageUniqueNames = "Some dogs have the same name!";
        }
        System.out.println(messageUniqueNames);

        Dog eldestDog = Dog.getEldestDog(dogA, dogB, dogC);
        String messageEldestDog = String.format("The eldest dog is %s the %s (%d)", eldestDog.getName(), eldestDog.getBreed(), eldestDog.getAge());
        System.out.println(messageEldestDog);

    }
}
