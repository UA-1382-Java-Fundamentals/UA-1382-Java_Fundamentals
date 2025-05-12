package com.softserve.academy.hw4_t4;

public class Dog {
    enum Breed {
        LABRADOR,
        GOLDEN_RETRIEVER,
        HUSKY
    }

    private final Breed breed;
    private final String name;
    private final int age;
    private static int oldest = 0;

    Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    void getOldestAge (int age) {
        if (oldest < age) {
            oldest = age;
        }
    }

    void printOldestDog() {
        if (age == oldest) {
            System.out.println("The oldest dog is:\nName: " + name + "; Age: " + age + "; Breed: " + breed);
        }
    }

}
