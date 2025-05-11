package com.softserve.academy.edu1.homework.lesson4;

import java.util.Scanner;

public class Dog {
    enum Breed {
        SPANIEL, CHIHUAHUA, BEAGLE;
    }

    String name;
    Breed breed;
    int age;

    Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog1 = new Dog("Bella", Breed.SPANIEL, 5);
        Dog dog2 = new Dog("Max", Breed.CHIHUAHUA, 4);
        Dog dog3 = new Dog("Charlie", Breed.BEAGLE, 7);

        if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog2.name.equals(dog3.name)) {
            System.out.println("There are dogs with the same name.");
        } else {
            Dog oldest = dog1;
            if (dog2.age > oldest.age) {
                oldest = dog2;
            }
            if (dog3.age > oldest.age) {
                oldest = dog3;
            }

            System.out.println("Oldest dog: " + oldest.name + ", Breed: " + oldest.breed);
        }
    }
}
