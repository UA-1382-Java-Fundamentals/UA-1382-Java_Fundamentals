package com.softserve.academy.homework11.Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        addElementsToSet(set);
        addElementsToSet(set2);
        System.out.println(set);
        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>(set);
        union(set3, set2);
        System.out.println(set3);

        Set<Integer> set4 = new TreeSet<>(set);
        intersect(set4, set2);
        System.out.println(set4);
    }

    public static void intersect(Set<Integer> set1, Set<Integer> set2){
        set1.retainAll(set2);
    }

    public static void union(Set<Integer> set1, Set<Integer> set2){
        set1.addAll(set2);
    }

    public static void addElementsToSet(Set<Integer> set){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(100));
        }
    }

}
