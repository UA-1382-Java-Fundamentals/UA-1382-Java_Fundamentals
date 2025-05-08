package com.softserve.academy.homework7.practicalTask1;

public class Task1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Donald");
        Dog dog2 = new Dog("Lord");
        Dog dog3 = new Dog("Rex");
        Cat cat1= new Cat("Murka");
        Cat cat2= new Cat("Simba");
        Cat cat3= new Cat("Barsik");

        Animal[] animals = new Animal[]{dog1, dog2, dog3, cat1, cat2, cat3};
        for (Animal animal: animals){
            animal.feed();
            animal.voice();
        }
    }
}
