package com.softserve.academy.edu10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(201) - 100);
        }
        System.out.println("My Collection: " + myCollection);

        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        int maxIndex = myCollection.indexOf(max);
        int minIndex = myCollection.indexOf(min);

        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("After swapping maximal and minimum: " + myCollection);

        int threeDigit = rand.nextInt(900) + 100;
        boolean inserted = false;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, threeDigit);
                inserted = true;
                break;
            }
        }

        if (!inserted) {
            System.out.println("No negative number found to insert before.");
        } else {
            System.out.println("After inserting 3-digit number before first negative: " + myCollection);
        }

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int a = myCollection.get(i);
            int b = myCollection.get(i + 1);

            if ((a >= 0 && b < 0) || (a < 0 && b >= 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("After inserting 0 between different signs: " + myCollection);

        int k = 5;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            if (i < k) {
                list1.add(myCollection.get(i));
            } else {
                list2.add(0, myCollection.get(i));
            }
        }
        System.out.println("List1 (first k elements): " + list1);
        System.out.println("List2 (rest in reverse): " + list2);

        boolean evenRemoved = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                evenRemoved = true;
                break;
            }
        }

        if (evenRemoved) {
            System.out.println("After removing last even element: " + myCollection);
        } else {
            System.out.println("No even number found to remove.");
        }

        int minValue = Collections.min(myCollection);
        int minIdx = myCollection.indexOf(minValue);

        if (minIdx < myCollection.size() - 1) {
            myCollection.remove(minIdx + 1);
            System.out.println("After removing element after first min: " + myCollection);
        } else {
            System.out.println("Minimum is last element; nothing to remove.");
        }
    }
}