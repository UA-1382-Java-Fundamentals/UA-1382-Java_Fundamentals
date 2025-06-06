package com.softserve.academy.edu4;

public class Dog4 {
    //Enum for dog breeds
    enum Breed {
        Labrador, Bulldog, Yorkshire_Terrier, Utonagan, Beagle
    }
    //Dog class
    static class Dog {
        String name;
        Breed breed;
        int age;

        Dog(String name, Breed breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        //Instances of dogs
        Dog dog1 = new Dog("Jason", Breed.Beagle, 2);
        Dog dog2 = new Dog("Maury", Breed.Bulldog, 5);
        Dog dog3 = new Dog("Joker", Breed.Labrador, 7);

        //Checking for unique names
        boolean nameIsUnique =
        !dog1.name.equals(dog2.name) &&
                !dog1.name.equals(dog3.name) &&
                !dog2.name.equals(dog3.name);

        if (nameIsUnique) {
            System.out.println("Every dog has unique name");
        } else {
            System.out.println("There are dogs with same name");
        }
        //Detecting the oldest dog
        Dog oldest = dog1;
        if (dog2.age > oldest.age) {
            oldest = dog2;
        }
        if (dog3.age > oldest.age) {
            oldest = dog3;
        }
        System.out.println("Oldest dog is " + oldest.name + ", " + oldest.breed);
    }
}
