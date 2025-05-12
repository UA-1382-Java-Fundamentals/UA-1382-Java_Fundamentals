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
        Dog dog1 = new Dog("Carlos", 12, Dog.Breed.HUSKY);
        Dog dog2 = new Dog("Ava", 1, Dog.Breed.LABRADOR);
        Dog dog3 = new Dog("Ava", 8, Dog.Breed.GOLDEN_RETRIEVER);

        dog1.getOldestAge(dog1.getAge());
        dog2.getOldestAge(dog2.getAge());
        dog3.getOldestAge(dog3.getAge());

        dog1.printOldestDog();
        dog2.printOldestDog();
        dog3.printOldestDog();

    }
}
