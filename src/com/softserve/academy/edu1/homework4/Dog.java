package homework4;

//4.*  Create a class called Dog that has the following fields: name, breed, age.
//        Declare enum for field breed.
//In main() method create create three instances of type Dog.
//Check if there are no two dogs with the same name;
//Output the name and the breed of the oldest dog.

import java.util.Objects;

enum Breed {
    LABRADOR, BEAGLE, BULLDOG, POMERANIAN, GERMAN_SHEPHERD, BICHON_FRISE, ROTTWEILER, PUG, DACHSHUND, HUSKY, GOLDEN_RETRIEVER
}

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 5, Breed.LABRADOR);
        Dog dog2 = new Dog("Max", 3, Breed.BEAGLE);
        Dog dog3 = new Dog("Charlie", 7, Breed.BULLDOG);

        if (dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)) {
            System.out.println("There are dogs with the same name.");
            return;
        }

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("The oldest dog is: " + oldestDog.getName() + ", Breed: " + oldestDog.getBreed());
    }
}
