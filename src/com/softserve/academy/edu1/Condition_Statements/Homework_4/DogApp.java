package com.softserve.academy.edu1.Condition_Statements.Homework_4;

public class DogApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy", Breed.LABRADOR, 5);
        Dog dog2 = new Dog("Max", Breed.BEAGLE, 3);
        Dog dog3 = new Dog("Charlie", Breed.HUSKY, 7);

        Dog[] dogs = { dog1, dog2, dog3 };

        boolean hasDuplicate = false;
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
                    hasDuplicate = true;
                    break;
                }
            }
        }

        if (hasDuplicate) {
            System.out.println("There are dogs with the same name.");
        } else {
            System.out.println("All dog names are unique.");
        }

        Dog oldest = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > oldest.getAge()) {
                oldest = dogs[i];
            }
        }

        System.out.println("The oldest dog is: " + oldest.getName() +
                " (" + oldest.getBreed() + ")");
    }
}