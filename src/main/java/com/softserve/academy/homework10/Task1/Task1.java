package com.softserve.academy.homework10.Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(new Random().ints(10, -10, 30).boxed().toList());
        System.out.println(myCollection);
        swapMinimumAndMaximum(myCollection);
        System.out.println(myCollection);
        addElements(myCollection);
        System.out.println(myCollection);
        addZeroElement(myCollection);
        System.out.println(myCollection);
        int index = new Random().nextInt(myCollection.size());
        List<Integer> copyList = new ArrayList<>(myCollection.subList(0, index));
        List<Integer> restReverseList = new ArrayList<>();
        for (int i = myCollection.size() - 1; i >= index; i--) {
            restReverseList.add(myCollection.get(i));
        }
        System.out.println(index);
        System.out.println(copyList);
        System.out.println(restReverseList);
        removeLastElement(myCollection);
        System.out.println(myCollection);
        removeNumberAfterMinimum(myCollection);
        System.out.println(myCollection);

    }

    public static void removeNumberAfterMinimum(List<Integer> collection) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < min) {
                min = collection.get(i);
                minIndex = i;
            }
        }
        if (minIndex != -1) {
            collection.remove(minIndex + 1);
            System.out.println("The number after the minimum was removed");
        }
    }

    public static void removeLastElement(List<Integer> collection) {
        boolean evenFound = false;
        for (int i = 0; i < collection.size(); i++) {
            if(collection.get(i) % 2 == 0){
                evenFound = true;
                collection.remove(collection.size() - 1);
                System.out.println("The last element was removed");
                break;
            }
        }
        if(!evenFound){
            System.out.println("There is no even element");
        }
    }

    public static void addZeroElement(List<Integer> collection) {
        for (int i = 0; i < collection.size() - 1; i++) {
            int current = collection.get(i);
            int next = collection.get(i + 1);
            boolean oppositeSigns = (current > 0 && next < 0) || (current < 0 && next > 0);
            if (oppositeSigns) {
                collection.add(i + 1, 0);
            }
        }
    }

    public static void addElements(List<Integer> collection) {
        int number = new Random().nextInt(100, 1000);
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                int insertIndex = (i == 0) ? 0 : i - 1;
                collection.add(insertIndex, number);
                break;
            }
        }
    }

    public static void swapMinimumAndMaximum(List<Integer> collection) {
        Integer min = Collections.min(collection);
        Integer max = Collections.max(collection);
        int minIndex = collection.indexOf(min);
        int maxIndex = collection.indexOf(max);
        Collections.swap(collection, minIndex, maxIndex);
        //alternative solution
//        int min = Integer.MAX_VALUE;
//        int minPosition = -1;
//        int max = Integer.MIN_VALUE;
//        int maxPosition = -1;
//        for (int i = 0; i < collection.size(); i++) {
//            if(collection.get(i) < min){
//                min = collection.get(i);
//                minPosition = i;
//            }
//            if(collection.get(i) > max){
//                max = collection.get(i);
//                maxPosition = i;
//            }
//        }
//        if (minPosition != -1 && maxPosition != -1) {
//            int temp = collection.get(minPosition);
//            collection.set(minPosition, collection.get(maxPosition));
//            collection.set(maxPosition, temp);
//        }
    }
}
