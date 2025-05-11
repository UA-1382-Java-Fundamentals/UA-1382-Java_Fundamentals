package com.softserve.academy.edu05.homework;

//4.* Create a class called Dog that has the following fields: name, breed, age.
//• Declare enum for field breed.
//      In main() method create create three instances of type Dog.
//o Check if there are no two dogs with the same name;
//o Output the name and the breed of the oldest dog.


public class Dog {

    private final String name;
    private final int age;
    private final Breed breed;

    public Dog(String name, String breed, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Incorrect name value");
        }
        if (breed == null) {
            throw new IllegalArgumentException("Incorrect breed value");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Incorrect age value");
        }
        this.name = name;
        this.age = age;

        try {
            this.breed = Breed.valueOf(breed.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Breed '" + breed + "' is not recognized.");
        }
    }

    public enum Breed {
        LABRADOR,
        BEAGLE,
        SHEPHERD,
        BULLDOG,
        POODLE;

        @Override
        public String toString() {
            String lower = name().toLowerCase();
            return lower.substring(0, 1).toUpperCase() + lower.substring(1);
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    public static void sameNamesChecker(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) ||
                dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two or more same names");
        } else{
            System.out.println("There are unique names");
        }
    }

    public static void findOldest(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("The oldest dog is " + oldestDog.getName() + ". His breed is " +
                oldestDog.getBreed() + ".");

    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Charley", "labrador", 3);
        Dog dog2 = new Dog("Chappie", "shepherd", 5);
        Dog dog3 = new Dog("Groove", "poodle", 1);

        Dog.sameNamesChecker(dog1, dog2, dog3);

        Dog.findOldest(dog1, dog2, dog3);
    }

}

