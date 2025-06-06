package com.softserve.academy.edu11;

import java.util.*;

public class Task1 {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();
        for (T element : set1) {
            result.add(element);
        }
        for (T element : set2) {
            result.add(element);
        }
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();
        for (T element : set1) {
            if (set2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        Collections.addAll(setA, "apple", "banana", "orange");

        Set<String> setB = new HashSet<>();
        Collections.addAll(setB, "banana", "peach", "potato", "cucumber");

        System.out.println("Hash code of A set elements:");
        for (String item : setA) {
            System.out.println(item + ": " + item.hashCode());
        }

        System.out.println("\nHash codes of B set elements:");
        for (String item : setB) {
            System.out.println(item + ": " + item.hashCode());
        }

        Set<String> unionSet = union(setA, setB);
        Set<String> intersectionSet = intersect(setA, setB);

        System.out.println("\nSet A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}