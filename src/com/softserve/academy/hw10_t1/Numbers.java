package com.softserve.academy.hw10_t1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Numbers {
    private final List<Integer> myCollection = new ArrayList<>();
    private final int maxAmount = 10;
    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public List<Integer> getMyCollection() {
        return myCollection;
    }

    public List<Integer> getList1() {
        return list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

    // Fill collection myCollection of 10 integers from the console
    public void inputElements() throws Exception {
        for (int i = 0; i < maxAmount; i++) {
            System.out.println("Input an integer number");
            try {
                myCollection.add(Integer.parseInt(sc.nextLine()));
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Not an integer number");
            } catch (Exception e) {
                throw new Exception("Unknown error");
            }
        }
    }

    // Swap the maximum and minimum elements in the list
    public void swapElements() {
        int minNumber;
        int maxNumber;

        try {
            minNumber = myCollection.getFirst();
            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) < minNumber) {
                    minNumber = myCollection.get(i);
                }
            }

            maxNumber = myCollection.getFirst();
            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) > maxNumber) {
                    maxNumber = myCollection.get(i);
                }
            }

            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) == minNumber) {
                    myCollection.set(i, maxNumber);
                } else if (myCollection.get(i) == maxNumber) {
                    myCollection.set(i, minNumber);
                }
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Array List is empty");
        }

    }

    // Insert a zero between all neighboring elements collection myCollection with different signs
    public void insertZero() {
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) * myCollection.get(i-1) < 0) {
                myCollection.add(i, 0);
            }
        }
    }

    // Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in
    //    reverse order.
    public void copyElements(int k) {

        for (int i = 0; i <= k; i++) {
            list1.add(myCollection.get(i));
        }

        for (int i = myCollection.size() - 1; i > k; i--) {
            list2.add(myCollection.get(i));
        }
    }

    // In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
    public void removeLastEvenElement() {
        boolean exists = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                exists = true;
                myCollection.remove(i);
                break;
            }
        }

        if (!exists) {
            System.out.println("There's no even element in the list");
        }
    }

    // Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
    public void removeElementFollowingFirstMinElement() {
        int MinElement = myCollection.getFirst();
        int indexOfMinElement = 0;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < MinElement) {
                MinElement = myCollection.get(i);
                indexOfMinElement = i;
            }
        }

        if (indexOfMinElement < myCollection.size() - 1) {
            myCollection.remove(indexOfMinElement + 1);
        }
    }
}
