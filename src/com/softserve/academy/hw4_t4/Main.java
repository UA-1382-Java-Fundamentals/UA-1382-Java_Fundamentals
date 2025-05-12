/*
Create a class called Dog that has the following fields: name, breed, age.
• Declare enum for field breed.
• In main() method create create three instances of type Dog.

o Check if there are no two dogs with the same name;
o Output the name and the breed of the oldest dog.
 */

package com.softserve.academy.hw4_t4;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Carlos", 12, Dog.Breed.HUSKY),
                new Dog("Ava", 1, Dog.Breed.LABRADOR),
                new Dog("Max", 8, Dog.Breed.GOLDEN_RETRIEVER)
        };

        for (Dog dog : dogs) {
            dog.getOldestAge(dog.getAge());
        }

        for (Dog dog : dogs) {
            dog.printOldestDog();
        }

    }
}
