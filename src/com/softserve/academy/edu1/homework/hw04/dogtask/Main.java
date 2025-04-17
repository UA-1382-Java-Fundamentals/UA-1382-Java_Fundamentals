package com.softserve.academy.edu1.homework.hw04.dogtask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dog first = new Dog("Sharik", Breed.BOXER, 2);
        Dog second = new Dog("Sharik", Breed.CHIHUAHUA, 8);
        Dog third = new Dog("Triksi", Breed.GERMAN_SHEPHERD, 3);

        List<Dog> dogs = Arrays.asList(first, second, third);

        boolean hasDuplicates = hasDuplicateNames(dogs);
        Dog oldest = getOldestDog(dogs);

        if (hasDuplicates) {
            System.out.println("Duplicate name found.");
        } else {
            System.out.println("All dog names are unique.");
        }

        System.out.printf("Oldest dog is %s, breed %s.",
                oldest.getName(), oldest.getBreed());
    }


    private static boolean hasDuplicateNames(List<Dog> dogs) {
        Set<String> names = new HashSet<>();
        for (Dog d : dogs) {
            if (!names.add(d.getName())) {
                return true;
            }
        }
        return false;
    }

    private static Dog getOldestDog(List<Dog> dogs) {
        return Collections.max(dogs, Comparator.comparingInt(Dog::getAge));
    }

}
