package com.softserve.academy.edu1.Collection_Part_2;

import java.util.*;

public class PersonMapTask {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Shevchenko", "Orest");
        personMap.put("Ivanov", "Ivan");
        personMap.put("Petrov", "Orest");
        personMap.put("Melnyk", "Oksana");
        personMap.put("Kovalenko", "Ihor");
        personMap.put("Bondarenko", "Olena");
        personMap.put("Tkachenko", "Orest");
        personMap.put("Polishchuk", "Maria");
        personMap.put("Hrytsenko", "Andrii");
        personMap.put("Stepanenko", "Yulia");

        System.out.println("Before removal:");
        personMap.forEach((k, v) -> System.out.println(k + " = " + v));

        long count = personMap.values().stream().filter(name -> name.equals("Orest")).count();
        System.out.println("Count of 'Orest': " + count);

        personMap.entrySet().removeIf(entry -> entry.getValue().equals("Orest"));

        System.out.println("\nAfter removal:");
        personMap.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}