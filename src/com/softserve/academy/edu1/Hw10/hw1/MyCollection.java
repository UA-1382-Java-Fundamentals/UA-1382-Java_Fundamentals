package com.softserve.academy.edu1.Hw10.hw1;

import java.util.*;

public class MyCollection {
    public List<Integer> myCollection= new LinkedList<Integer>();
    public List<Integer> list1 = new LinkedList<Integer>();
    public List<Integer> list2 = new LinkedList<Integer>();

    Random random = new Random();

    public void feelList(){
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(199) -99;
            myCollection.add(rand);
        }
    }
    public void printList(){
        System.out.println("List: ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(myCollection.get(i));
        }
    }
    public int  lookforMin(){
        return Collections.min(myCollection);
    }
    public int  lookforMax(){
        return Collections.max(myCollection);
    }

    public void swapList(){
        int min = lookforMin();
        int max = lookforMax();

        System.out.println("===".repeat(20));
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("===".repeat(20));

        int indexMin= myCollection.indexOf(min);
        int indexMax= myCollection.lastIndexOf(max);

        myCollection.set(indexMin, max);
        myCollection.set(indexMax, min);

    }

    public void firstNegativeElement(){
        int negative=0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i)<negative) {
                negative=myCollection.get(i);
                break;
            }
        }
        if (negative > 0) {
            int randomNumber = random.nextInt(900) + 100;
            myCollection.add(negative, randomNumber);
        } else if (negative == 0) {
            int randomNumber = random.nextInt(900) + 100;
            myCollection.add(0, randomNumber);
        }
    }

    public void cloneK_Elements(int k){
        for (int i = 0; i < k && i < myCollection.size(); i++) {
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
    }
    public void printList1(){
        System.out.println("List1: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
    public void printList2(){
        System.out.println("List2: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    public void removeLastEvenElement(){
        boolean removed = false;
        for (int i = myCollection.size()-1; i >= 0; i--) {
            if (myCollection.get(i)%2==0) {
                System.out.println("Removed number is: "+myCollection.get(i));
                myCollection.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Element not found");
        }
    }

    public void removeFirstMinElement(){
        for (int i = 1; i <= myCollection.size()-1; i++) {
            if (myCollection.get(i)<myCollection.get(i-1)) {
                System.out.println("Removed number is: "+myCollection.get(i));
                myCollection.remove(i);
                break;
            }
        }
    }
}
