package com.softserve.academy.edu1.Collections_Part_1.Homework_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateList(10);
        System.out.println("1 Initial list: " + numbers);

        printMinMax(numbers);

        insertBeforeFirstNegative(numbers);
        System.out.println("2 After inserting 3-digit number before first negative: " + numbers);

        ArrayList<Integer> withZeros = insertZerosBetweenSigns(numbers);
        System.out.println("3 List with 0s between opposite signs: " + withZeros);

        int k = 4;
        splitList(withZeros, k);

        deleteLastEven(numbers);
        System.out.println("6 After deleting last even element: " + numbers);

        deleteAfterMin(numbers);
        System.out.println("7 After deleting element after min: " + numbers);
    }

    static ArrayList<Integer> generateList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(201) - 100);
        }
        return list;
    }

    static void printMinMax(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            int max = Collections.max(list);
            int min = Collections.min(list);
            System.out.println("Max: " + max + ", Min: " + min);
        }
    }

    static void insertBeforeFirstNegative(ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                int rnd = rand.nextInt(900) + 100;
                list.add(i, rnd);
                break;
            }
        }
    }

    static ArrayList<Integer> insertZerosBetweenSigns(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);
            result.add(current);
            if (current * next < 0) {
                result.add(0);
            }
        }
        result.add(list.get(list.size() - 1));
        return result;
    }

    static void splitList(ArrayList<Integer> list, int k) {
        if (k < 0 || k > list.size()) {
            System.out.println("Invalid k value");
            return;
        }
        ArrayList<Integer> firstPart = new ArrayList<>(list.subList(0, k));
        ArrayList<Integer> secondPart = new ArrayList<>(list.subList(k, list.size()));
        Collections.reverse(secondPart);

        System.out.println("4 First part: " + firstPart);
        System.out.println("  Second part reversed: " + secondPart);
    }

    static void deleteLastEven(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                System.out.println("Deleted last even: " + list.get(i));
                list.remove(i);
                return;
            }
        }
        System.out.println("No even elements found");
    }

    static void deleteAfterMin(ArrayList<Integer> list) {
        if (list.isEmpty()) return;

        int min = Collections.min(list);
        int index = list.indexOf(min);

        if (index < list.size() - 1) {
            System.out.println("Deleted element after min: " + list.get(index + 1));
            list.remove(index + 1);
        } else {
            System.out.println("Min is the last element, nothing to delete");
        }
    }
}
