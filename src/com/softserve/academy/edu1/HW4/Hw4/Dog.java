package com.softserve.academy.edu1.HW4.Hw4;

import java.util.SplittableRandom;

public class Dog {
    private String name;
    private String breed;
    private int age;

    enum DogType {
        GERMAN_SHEPHERED("German_Shepherd"),
        ENGLISH_Bulldog("English_Bulldog"),
        LABLADOR_retriever("Labrador_retriever"),
        GOLDEN_Retriever("Golden_Retriever");

        private final String breed;


        DogType(String breed) {
        this.breed=breed;
        }

        public String getBreed() {
            return breed;
        }
    }
    Dog(String name, int age) {
     this.name = name;
     this.age = age;
     checkDogType(breed);
    }
    public void checkDogType(String type) {
        for (DogType dogType : DogType.values()) {
            if (dogType.getBreed().equals(type)) {
                setBreed(type);
                System.out.println( toString());
            }
        }
    }


    @Override
    public String toString() {
        return "name: " + getName() + ", breed: " +getBreed() + ", age: " + getAge();
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
