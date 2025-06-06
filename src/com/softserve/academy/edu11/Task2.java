package com.softserve.academy.edu11;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Carter", "Orest");
        personMap.put("Blackwood", "Julian");
        personMap.put("Bennett", "Maya");
        personMap.put("Ramsey", "Michael");
        personMap.put("Chen", "Anna");
        personMap.put("Lang", "Orest");
        personMap.put("Davis", "Sophia");
        personMap.put("Morales", "David");
        personMap.put("Patel", "Emily");

        System.out.println("Original Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            String lastName = entry.getKey();
            String firstName = entry.getValue();
            System.out.println("Last Name: " + lastName +
                    " (hash: " + lastName.hashCode() + "), " +
                    "First Name: " + firstName +
                    " (hash: " + firstName.hashCode() + ")");
        }

        Collection<String> firstNames = personMap.values();
        Set<String> uniqueNames = new HashSet<>();
        boolean hasDuplicates = false;

        for (String name : firstNames) {
            if (!uniqueNames.add(name)) {
                hasDuplicates = true;
                break;
            }
        }

        System.out.println("\nAre there duplicate names? " + hasDuplicates);
        String nameRemove = "Orest";
        personMap.values().removeIf(value -> value.equals(nameRemove));

        System.out.println("\nMap after removing people with name " + nameRemove + ":");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }
}