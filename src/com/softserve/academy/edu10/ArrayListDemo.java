package com.softserve.academy.edu10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // Adding elements to the list
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("Java");
        list.add("Generics");
        //Adding an element at a specific index
        list.add(1, "Programming");

        String secondElement = list.get(1);
        String firstElement = list.getFirst();//firstElement
        String lastElement = list.getLast();//lastElement
        list.set(0, "Good Evening");

        System.out.println("Second element: " + secondElement);
        System.out.println(list);
        list.remove(1);
        list.remove("!");
        boolean isRemoved = list.remove("Java");
        System.out.println("Is Java removed? " + isRemoved);
        //Searching index for an element
        int index = list.indexOf("Generics");
        System.out.println("List after removing elements: " + list);
        boolean isEmpty = list.isEmpty();

        int size = list.size();
        boolean contains = list.contains("Hello");
        Collections.sort(list);
        list.clear();

    }
}
